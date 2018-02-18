package com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating;

import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 23.10.2017. */

public interface CalculatingPercentageOfPositiveNumbers<T extends Number> extends CalculatingPercentage<T> {

    @Override
    default int calculatePercentageOfPositiveNumbers(Array<T> array) {
        int amountOfPositiveNumbers = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            double value = array.getArray()[i].doubleValue();
            if (value > 0) {
                amountOfPositiveNumbers++;
            }
        }
        return CalculatingPercentage.calculatePercentage(amountOfPositiveNumbers, array.getArray().length);
    }

}
