package com.lugowoy.tasks.arrays.compressAnArrayByThrowingOutNullElements;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 16.03.2017. */

@FunctionalInterface
public interface Compressible<T> {

    void compress(Array<T> array);
}
