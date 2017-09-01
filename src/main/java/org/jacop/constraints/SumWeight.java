/*
 * SumWeight.java
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

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.jacop.api.SatisfiedPresent;
import org.jacop.api.UsesQueueVariable;
import org.jacop.core.*;

import java.util.stream.Stream;

/**
 * SumWeight constraint implements the weighted summation over several
 * variables . It provides the weighted sum from all variables on the list.
 * The weights are integers.
 *
 * Use when number of variables is greater than 15, otherwise use LinearInt.
 *
 * @author Krzysztof Kuchcinski and Radoslaw Szymanek
 * @version 3.1
 */
public class SumWeight extends Constraint implements UsesQueueVariable, SatisfiedPresent {

    static AtomicInteger idNumber = new AtomicInteger(0);

    /**
     * It specifies a list of variables being summed.
     */
    private IntVar list[];

    /**
     * It specifies a list of weights associated with the variables being summed.
     */
    private int weights[];

    /**
     * It specifies value to which SumWeight is equal to.
     */
    private int equalTo;


    LinkedHashSet<IntVar> variableQueue = new LinkedHashSet<>();

    /**
     * @param list    the list of varibales
     * @param weights the list of weights
     * @param sum     the resulting sum
     */
    public SumWeight(IntVar[] list, int[] weights, IntVar sum) {
        this(list, weights, sum, 0);
    }

    /**
     * @param list    the list of varibales
     * @param weights the list of weights
     * @param equalTo     the value to which SumWeight is equal to.
     */
    public SumWeight(IntVar[] list, int[] weights, int equalTo) {
        this(list, weights, null, equalTo);
    }

    private SumWeight(IntVar[] list, int[] weights, IntVar sum, int equalTo) {

        checkInputForNullness(new String[]{"list", "weights"}, new Object[][]{list, {weights}});

        if (list.length != weights.length)
            throw new IllegalArgumentException("Constraint " + this.getClass().getSimpleName() +
                "has length of list and weights parameter different.");

        queueIndex = 1;
        numberId = idNumber.incrementAndGet();

        Map<IntVar, Integer> parameters = Var.createEmptyPositioning();

        for (int i = 0; i < list.length; i++) {
            if (weights[i] == 0)
                continue;
            Integer accumulatedCoefficient = parameters.getOrDefault(list[i], 0);
            parameters.put(list[i], accumulatedCoefficient + weights[i]);
        }

        if (sum != null) {
            Integer accumulatedCoefficient = parameters.getOrDefault(sum, 0);
            parameters.put(sum, accumulatedCoefficient - 1);
        }

        this.list = new IntVar[parameters.size()];
        this.weights = new int[parameters.size()];
        this.equalTo = equalTo;

        int i = 0;
        for (Map.Entry<IntVar, Integer> e : parameters.entrySet()) {
            this.list[i] = e.getKey();
            this.weights[i] = e.getValue();
            i++;
        }

        checkForOverflow();

        setScope(Arrays.stream(this.list));

    }


    /**
     * It constructs the constraint SumWeight.
     *
     * @param variables variables which are being multiplied by weights.
     * @param weights   weight for each variable.
     * @param sum       variable containing the sum of weighted variables.
     */
    public SumWeight(List<? extends IntVar> variables, List<Integer> weights, IntVar sum) {
        this(variables.toArray(new IntVar[variables.size()]), weights.stream().mapToInt(i -> i).toArray(), sum);
    }


    @Override public void removeLevelLate(int level) {
        variableQueue.clear();
        backtrackHasOccured = true;

    }


    /**
     * The sum of grounded variables.
     */
    private TimeStamp<Integer> sumGrounded;

    /**
     * The position for the next grounded variable.
     */
    private TimeStamp<Integer> nextGroundedPosition;

    @Override public void consistency(Store store) {

        treatChangedVariables();

        if (backtrackHasOccured) {

            backtrackHasOccured = false;

            int pointer = nextGroundedPosition.value();

            lMin = sumGrounded.value();
            lMax = lMin;

            for (int i = pointer; i < list.length; i++) {

                IntDomain currentDomain = list[i].domain;

                assert (!currentDomain.singleton()) : "Singletons should not occur in this part of the array";

                int mul1 = currentDomain.min() * weights[i];
                int mul2 = currentDomain.max() * weights[i];

                if (mul1 <= mul2) {
                    lMin += mul1;
                    // lMin = add(lMin, mul1);
                    lMinArray[i] = mul1;
                    lMax += mul2;
                    // lMax = add(lMax, mul2);
                    lMaxArray[i] = mul2;
                } else {

                    lMin += mul2;
                    // lMin = add(lMin, mul2);
                    lMinArray[i] = mul2;
                    lMax += mul1;
                    // lMax = add(lMax, mul1);
                    lMaxArray[i] = mul1;

                }

            }

        }



        do {

            if (! ( lMin <= equalTo && equalTo <= lMax ) )
                throw Store.failException;

            store.propagationHasOccurred = false;

            int min = equalTo - lMax;
            int max = equalTo - lMin;

            int pointer1 = nextGroundedPosition.value();

            for (int i = pointer1; i < list.length; i++) {

                IntVar v = list[i];

                float d1 = ((float) (min + lMaxArray[i]) / weights[i]);
                float d2 = ((float) (max + lMinArray[i]) / weights[i]);

                int divMin, divMax;
                if (d1 <= d2) {
                    divMin = toInt(Math.round(Math.ceil(d1)));
                    divMax = toInt(Math.round(Math.floor(d2)));
                } else {
                    divMin = toInt(Math.round(Math.ceil(d2)));
                    divMax = toInt(Math.round(Math.floor(d1)));
                }

                if (divMin > divMax)
                    throw Store.failException;

                v.domain.in(store.level, v, divMin, divMax);

            }

            treatChangedVariables();

        } while (store.propagationHasOccurred);

    }

    @Override public int getDefaultConsistencyPruningEvent() {
        return IntDomain.BOUND;
    }

    @Override public void impose(Store store) {

        positionMaping = Var.positionMapping(list, false, this.getClass());

        sumGrounded = new TimeStamp<>(store, 0);
        nextGroundedPosition = new TimeStamp<>(store, 0);

        store.registerRemoveLevelLateListener(this);

        lMinArray = new int[list.length];
        lMaxArray = new int[list.length];
        lMin = 0;
        lMax = 0;

        super.impose(store);

    }

    private int lMin;

    private int lMax;

    private int[] lMinArray;

    private int[] lMaxArray;

    private Map<Var, Integer> positionMaping;

    private boolean backtrackHasOccured = false;

    @Override public void queueVariable(int level, Var var) {
        variableQueue.add((IntVar) var);
    }


    private void treatChangedVariables() {

        LinkedHashSet<IntVar> fdvs = variableQueue;
        variableQueue = new LinkedHashSet<>();

        for (IntVar var : fdvs) {

            int i = positionMaping.get(var);
            
            if (var.singleton()) {

                int pointer = nextGroundedPosition.value();

                if (i < pointer)
                    return;

                int value = var.min();

                int sumJustGrounded = 0;

                int weightGrounded = weights[i];

                if (pointer < i) {
                    IntVar grounded = list[i];
                    list[i] = list[pointer];
                    list[pointer] = grounded;

                    positionMaping.put(list[i], i);
                    positionMaping.put(list[pointer], pointer);

                    int temp = lMinArray[i];
                    lMinArray[i] = lMinArray[pointer];
                    lMinArray[pointer] = temp;

                    temp = lMaxArray[i];
                    lMaxArray[i] = lMaxArray[pointer];
                    lMaxArray[pointer] = temp;

                    weights[i] = weights[pointer];
                    weights[pointer] = weightGrounded;

                }

                sumJustGrounded += value * weightGrounded; // add(sumJustGrounded, IntDomain.multiply(value, weightGrounded));

                sumGrounded.update(sumGrounded.value() + sumJustGrounded);

                lMin += sumJustGrounded - lMinArray[pointer]; //add(lMin, sumJustGrounded - lMinArray[pointer]);
                lMax += sumJustGrounded - lMaxArray[pointer];
                lMinArray[pointer] = sumJustGrounded;
                lMaxArray[pointer] = sumJustGrounded;

                pointer++;
                nextGroundedPosition.update(pointer);

            } else {

                int mul1 = var.min() * weights[i];
                int mul2 = var.max() * weights[i];

                if (mul1 <= mul2) {

                    lMin += mul1 - lMinArray[i]; //add(lMin, mul1 - lMinArray[i]);
                    lMinArray[i] = mul1;

                    lMax += mul2 - lMaxArray[i]; //add(lMax, mul2 - lMaxArray[i]);
                    lMaxArray[i] = mul2;

                } else {

                    lMin += mul2 - lMinArray[i]; //add(lMin, mul2 - lMinArray[i]);
                    lMinArray[i] = mul2;

                    lMax += mul1 - lMaxArray[i]; //add(lMax, mul1 - lMaxArray[i]);
                    lMaxArray[i] = mul1;

                }

            }

        }

    }

    @Override public boolean satisfied() {

        return nextGroundedPosition.value() == list.length && sumGrounded.value() == equalTo;

    }

    void checkForOverflow() {

        int s1 = Math.multiplyExact(equalTo, -1);
        int s2 = Math.multiplyExact(equalTo, -1);

        int sumMin = 0, sumMax = 0;
        if (s1 <= s2) {
            sumMin = Math.addExact(sumMin, s1);
            sumMax = Math.addExact(sumMax, s2);
        } else {
            sumMin = Math.addExact(sumMin, s2);
            sumMax = Math.addExact(sumMax, s1);
        }

        for (int i = 0; i < list.length; i++) {
            int n1 = Math.multiplyExact(list[i].min(), weights[i]);
            int n2 = Math.multiplyExact(list[i].max(), weights[i]);

            if (n1 <= n2) {
                sumMin = Math.addExact(sumMin, n1);
                sumMax = Math.addExact(sumMax, n2);
            } else {
                sumMin = Math.addExact(sumMin, n2);
                sumMax = Math.addExact(sumMax, n1);
            }
        }
    }

    @Override public String toString() {

        StringBuilder result = new StringBuilder(id());
        result.append(" : sumWeight( [ ");

        for (int i = 0; i < list.length; i++) {
            result.append(list[i]);
            if (i < list.length - 1)
                result.append(", ");
        }
        result.append("], [");

        for (int i = 0; i < weights.length; i++) {
            result.append(weights[i]);
            if (i < weights.length - 1)
                result.append(", ");
        }

        result.append("], ").append(equalTo).append(" )");

        return result.toString();

    }

}
