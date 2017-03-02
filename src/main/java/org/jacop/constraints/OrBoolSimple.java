/**
 * OrBoolSimple.java
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

package org.jacop.constraints;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.jacop.core.IntDomain;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.core.Var;

/**
 * If at least one variable is equal 1 then result variable is equal 1 too.
 * Otherwise, result variable is equal to zero.
 * It restricts the domain of a and b as well as result to be between 0 and 1.
 *
 * @author Krzysztof Kuchcinski and Radoslaw Szymanek
 * @version 4.4
 */

public class OrBoolSimple extends PrimitiveConstraint {

    static AtomicInteger idNumber = new AtomicInteger(0);

    /**
     * It specifies variables which all must be equal to 1 to set result variable to 1.
     */
    public IntVar a, b;

    /**
     * It specifies variable result, storing the result of or function performed a list of variables.
     */
    public IntVar result;

    /**
     * It specifies the arguments required to be saved by an XML format as well as
     * the constructor being called to recreate an object from an XML format.
     */
    public static String[] xmlAttributes = {"a", "b", "result"};

    /**
     * It constructs orBool.
     *
     * @param a      a parameter
     * @param b      b parameter
     * @param result variable which is equal 0 if none of x is equal to zero.
     */
    public OrBoolSimple(IntVar a, IntVar b, IntVar result) {

        assert (a != null) : "First variable is null";
        assert (b != null) : "Second variable is null";
        assert (result != null) : "Result variable is null";

        this.numberId = idNumber.incrementAndGet();
        this.numberArgs = 3;

        this.a = a;
        this.b = b;
        this.result = result;

        assert (checkInvariants() == null) : checkInvariants();

        queueIndex = 0;
    }

    @Override public ArrayList<Var> arguments() {

        ArrayList<Var> variables = new ArrayList<Var>(3);

        variables.add(a);
        variables.add(b);
        variables.add(result);
        return variables;
    }

    // registers the constraint in the constraint store
    @Override public void impose(Store store) {

        a.putModelConstraint(this, getConsistencyPruningEvent(a));
        b.putModelConstraint(this, getConsistencyPruningEvent(b));
        result.putModelConstraint(this, getConsistencyPruningEvent(result));

        store.addChanged(this);
        store.countConstraint();
    }

    @Override public void include(Store store) {
    }

    public void consistency(Store store) {
        // a OR b = result
        if (a.max() == 0 && b.max() == 0)
            result.domain.in(store.level, result, 0, 0);
        else if (a.min() == 1 || b.min() == 1) {
            result.domain.in(store.level, result, 1, 1);
            removeConstraint();
        } else if (result.max() == 0) {
            a.domain.in(store.level, a, 0, 0);
            b.domain.in(store.level, b, 0, 0);
        } else if (result.min() == 1)
            if (a.max() == 0)
                b.domain.in(store.level, b, 1, 1);
            else if (b.max() == 0)
                a.domain.in(store.level, a, 1, 1);
    }

    @Override public void notConsistency(Store store) {
        // not(a OR b) = not a and not b = result
        if (a.min() == 1 || b.min() == 1) {
            result.domain.in(store.level, result, 0, 0);
            removeConstraint();
        } else if (a.max() == 0 && b.max() == 0)
            result.domain.in(store.level, result, 1, 1);
        else if (result.min() == 1) {
            a.domain.in(store.level, a, 0, 0);
            b.domain.in(store.level, b, 0, 0);
        } else if (result.max() == 0)
            if (a.max() == 0)
                b.domain.in(store.level, b, 1, 1);
            else if (b.max() == 0)
                a.domain.in(store.level, a, 1, 1);
    }

    @Override public boolean satisfied() {
        return (result.max() == 0 && a.max() == 0 && b.max() == 0) || (result.min() == 1 && (a.min() == 1 || b.min() == 1));
    }

    @Override public boolean notSatisfied() {
        return (result.min() == 1 && a.max() == 0 && b.max() == 0) || (result.max() == 0 && (a.min() == 1 || b.min() == 1));
    }

    @Override public void removeConstraint() {
        a.removeConstraint(this);
        b.removeConstraint(this);
        result.removeConstraint(this);
    }

    @Override public String toString() {

        StringBuffer resultString = new StringBuffer(id());

        resultString.append(" : orBoolSimple([ ");
        resultString.append(a + ", " + b);

        resultString.append("], ");
        resultString.append(result);
        resultString.append(")");
        return resultString.toString();
    }

    /**
     * It checks invariants required by the constraint. Namely that
     * boolean variables have boolean domain.
     *
     * @return the string describing the violation of the invariant, null otherwise.
     */
    public String checkInvariants() {

        for (IntVar var : new IntVar[] {a, b})
            if (var.min() < 0 || var.max() > 1)
                return "Variable " + var + " does not have boolean domain";

        return null;
    }

    @Override public int getConsistencyPruningEvent(Var var) {

        // If consistency function mode
        if (consistencyPruningEvents != null) {
            Integer possibleEvent = consistencyPruningEvents.get(var);
            if (possibleEvent != null)
                return possibleEvent;
        }
        return IntDomain.BOUND;
    }

    @Override public int getNestedPruningEvent(Var var, boolean mode) {

        // If consistency function mode
        if (mode) {
            if (consistencyPruningEvents != null) {
                Integer possibleEvent = consistencyPruningEvents.get(var);
                if (possibleEvent != null)
                    return possibleEvent;
            }
            return IntDomain.ANY;
        }
        // If notConsistency function mode
        else {
            if (notConsistencyPruningEvents != null) {
                Integer possibleEvent = notConsistencyPruningEvents.get(var);
                if (possibleEvent != null)
                    return possibleEvent;
            }
            return IntDomain.GROUND;
        }
    }

    @Override public void increaseWeight() {
        if (increaseWeight) {
            result.weight++;
            for (Var v : new Var[] {a, b})
                v.weight++;
        }
    }

    @Override public int getNotConsistencyPruningEvent(Var var) {

        // If notConsistency function mode
        if (notConsistencyPruningEvents != null) {
            Integer possibleEvent = notConsistencyPruningEvents.get(var);
            if (possibleEvent != null)
                return possibleEvent;
        }
        return IntDomain.GROUND;
    }


}
