package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 03-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 03.02.2017
 * <p>
 * Functional interface declares a contract for calculations using the three variables.
 * </p>
 * @param <T> - Calculation result type.
 * @param <K> - Type of variable used for calculations.
 * @param <V> - Type of variable used for calculations.
 * @param <Z> - Type of variable used for calculations.
 */
@FunctionalInterface
public interface CalculableOnTheThreeVariables<T, K, V, Z> {

    /**
     * <p>
     * The method(function) of performing calculations on the value of the three variables.
     * </p>
     * @param kFirst - The first variable for calculate.
     * @param vSecond - The second variable for calculate.
     * @param zThird - The third variable for calculate.
     * @return The result of the calculation the type T.
     * @since 03.02.2017
     */
    T calculate(K kFirst, V vSecond, Z zThird);

}
