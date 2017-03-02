/**
 * BoolConstraints.java
 * This file is part of JaCoP.
 * <p>
 * JaCoP is a Java Constraint Programming solver.
 * <p>
 * Copyright (C) 2000-2008 Krzysztof Kuchcinski and Radoslaw Szymanek
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * <p>
 * Notwithstanding any other provision of this License, the copyright
 * owners of this work supplement the terms of this License with terms
 * prohibiting misrepresentation of the origin of this work and requiring
 * that modified versions of this work be marked in reasonable ways as
 * different from the original version. This supplement of the license
 * terms is in accordance with Section 7 of GNU Affero General Public
 * License version 3.
 * <p>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jacop.fz.constraints;

import java.util.ArrayList;

import org.jacop.core.Store;
import org.jacop.core.IntVar;

import org.jacop.fz.*;

import org.jacop.constraints.AndBool;
import org.jacop.constraints.XorBool;
import org.jacop.constraints.OrBool;
import org.jacop.constraints.SumBool;
import org.jacop.constraints.AndBoolSimple;
import org.jacop.constraints.PrimitiveConstraint;
import org.jacop.constraints.XlteqY;
import org.jacop.constraints.XneqY;
import org.jacop.constraints.Reified;
import org.jacop.constraints.BoolClause;

import org.jacop.satwrapper.SatTranslation;
import org.jacop.constraints.OrBoolSimple;


/**
 *
 * Generation of boolean constraints in flatzinc
 *
 * @author Krzysztof Kuchcinski 
 *
 */
class BoolConstraints extends Support implements ParserTreeConstants {

    static boolean reified;

    public BoolConstraints(Store store, Tables d, SatTranslation sat) {
        super(store, d, sat);
    }

    static void gen_array_bool_and(SimpleNode node) {

        IntVar[] a1 = getVarArray((SimpleNode) node.jjtGetChild(0));
        IntVar v = getVariable((ASTScalarFlatExpr) node.jjtGetChild(1));

        if (Options.useSat())
            sat.generate_and(a1, v);
        else if (allVarOne(a1))
            v.domain.in(store.level, v, 1, 1);
        else if (atLeastOneVarZero(a1))
            v.domain.in(store.level, v, 0, 0);
        else
            poseDC(new AndBool(a1, v));
    }

    static void gen_bool_and(SimpleNode node) {

        ASTScalarFlatExpr p1 = (ASTScalarFlatExpr) node.jjtGetChild(0);
        ASTScalarFlatExpr p2 = (ASTScalarFlatExpr) node.jjtGetChild(1);
        ASTScalarFlatExpr p3 = (ASTScalarFlatExpr) node.jjtGetChild(2);

        IntVar v1 = getVariable(p1);
        IntVar v2 = getVariable(p2);
        IntVar v3 = getVariable(p3);

        if (Options.useSat())
            sat.generate_and(new IntVar[] {v1, v2}, v3);
        else
            pose(new AndBoolSimple(v1, v2, v3));
    }

    static void gen_array_bool_or(SimpleNode node) {
        IntVar[] a1 = getVarArray((SimpleNode) node.jjtGetChild(0));
        IntVar v = getVariable((ASTScalarFlatExpr) node.jjtGetChild(1));

        if (Options.useSat())
            sat.generate_or(a1, v);
        else {
            if (v.singleton(1))
                pose(new SumBool(store, a1, ">=", v));
            else if (allVarZero(a1))
                v.domain.in(store.level, v, 0, 0);
            else if (atLeastOneVarOne(a1))
                v.domain.in(store.level, v, 1, 1);
            else
                poseDC(new OrBool(a1, v));
        }
    }

    static void gen_array_bool_xor(SimpleNode node) {

        SimpleNode p1 = (SimpleNode) node.jjtGetChild(0);
        IntVar[] a1 = getVarArray(p1);

        if (Options.useSat())
            sat.generate_xor(a1, dictionary.getConstant(1));
        else
            pose(new XorBool(a1, dictionary.getConstant(1)));
    }

    static void gen_bool_not(SimpleNode node) {

        ASTScalarFlatExpr p1 = (ASTScalarFlatExpr) node.jjtGetChild(0);
        ASTScalarFlatExpr p2 = (ASTScalarFlatExpr) node.jjtGetChild(1);

        IntVar v1 = getVariable(p1);
        IntVar v2 = getVariable(p2);

        if (Options.useSat())
            sat.generate_not(v1, v2);
        else
            pose(new XneqY(v1, v2));
    }

    static void gen_bool_or(SimpleNode node) {

        IntVar v1 = getVariable((ASTScalarFlatExpr) node.jjtGetChild(0));
        IntVar v2 = getVariable((ASTScalarFlatExpr) node.jjtGetChild(1));
        IntVar v3 = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));

        if (Options.useSat())
            sat.generate_or(new IntVar[] {v1, v2}, v3);
        else
            pose(new OrBoolSimple(v1, v2, v3));
    }

    static void gen_bool_xor(SimpleNode node) {

        ASTScalarFlatExpr p1 = (ASTScalarFlatExpr) node.jjtGetChild(0);
        ASTScalarFlatExpr p2 = (ASTScalarFlatExpr) node.jjtGetChild(1);
        ASTScalarFlatExpr p3 = (ASTScalarFlatExpr) node.jjtGetChild(2);

        IntVar v1 = getVariable(p1);
        IntVar v2 = getVariable(p2);
        IntVar v3 = getVariable(p3);

        if (Options.useSat())
            sat.generate_neq_reif(v1, v2, v3);
        else
            pose(new XorBool(new IntVar[] {v1, v2}, v3));
    }

    static void gen_bool_clause(SimpleNode node) {
        reified = false;
        clause_generation(node);
    }

    static void gen_bool_clause_reif(SimpleNode node) {
        reified = true;
        clause_generation(node);
    }

    static void gen_bool2int(SimpleNode node) {
    }

    static void clause_generation(SimpleNode node) {

        IntVar[] a1 = unique(getVarArray((SimpleNode) node.jjtGetChild(0)));
        IntVar[] a2 = unique(getVarArray((SimpleNode) node.jjtGetChild(1)));
        for (IntVar v1 : a1)
            for (IntVar v2 : a2)
                if (v1.equals(v2))
                    if (reified) {
                        IntVar r = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));
                        r.domain.in(store.level, r, 1, 1);
                        return;
                    } else
                        return; // already satisfied since a variable is both negated and not negated

        if (a1.length == 0 && a2.length == 0)
            if (reified) {
                IntVar r = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));
                r.domain.in(store.level, r, 1, 1);
                return;
            } else
                return;

        if (Options.useSat()) {
            if (reified) { // reified
                IntVar r = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));
                sat.generate_clause_reif(a1, a2, r);
            } else
                sat.generate_clause(a1, a2);
        } else { // not SAT generation, use CP constraints
            ArrayList<IntVar> a1reduced = new ArrayList<IntVar>();
            for (int i = 0; i < a1.length; i++)
                if (a1[i].min() == 1)
                    if (reified) {
                        IntVar r = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));
                        r.domain.in(store.level, r, 1, 1);
                        return;
                    } else
                        return; // already satisfied since a variable is both negated and not negated
                else if (a1[i].max() != 0)
                    a1reduced.add(a1[i]);

            ArrayList<IntVar> a2reduced = new ArrayList<IntVar>();
            for (int i = 0; i < a2.length; i++)
                if (a2[i].max() == 0)
                    if (reified) {
                        IntVar r = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));
                        r.domain.in(store.level, r, 1, 1);
                        return;
                    } else
                        return; // already satisfied since a variable is both negated and not negated
                else if (a2[i].min() != 1)
                    a2reduced.add(a2[i]);

            if (a1reduced.size() == 0 && a2reduced.size() == 0)
                if (reified) {
                    IntVar r = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));
                    r.domain.in(store.level, r, 0, 0);
                    return;
                } else
                    throw store.failException;

            PrimitiveConstraint c;
            if (a1reduced.size() == 0)
                c = new AndBool(a2reduced, dictionary.getConstant(0)).decompose(store).get(0);
            else if (a2reduced.size() == 0) {
                c = new OrBool(a1reduced, dictionary.getConstant(1)).decompose(store).get(0);
            } else if (a1reduced.size() == 1 && a2reduced.size() == 1)
                c = new XlteqY(a2reduced.get(0), a1reduced.get(0));
            else
                c = new BoolClause(a1reduced, a2reduced);

            // bool_clause_reif/3 defined in redefinitions-2.0.
            if (reified) {
                IntVar r = getVariable((ASTScalarFlatExpr) node.jjtGetChild(2));
                pose(new Reified(c, r));
            } else
                pose(c);
        }
    }

    static boolean allVarOne(IntVar[] w) {
        for (int i = 0; i < w.length; i++)
            if (w[i].min() != 1)
                return false;
        return true;
    }

    static boolean allVarZero(IntVar[] w) {
        for (int i = 0; i < w.length; i++)
            if (w[i].max() != 0)
                return false;
        return true;
    }

    static boolean atLeastOneVarZero(IntVar[] w) {
        for (int i = 0; i < w.length; i++)
            if (w[i].max() == 0)
                return true;
        return false;
    }

    static boolean atLeastOneVarOne(IntVar[] w) {
        for (int i = 0; i < w.length; i++)
            if (w[i].min() == 1)
                return true;
        return false;
    }
}
