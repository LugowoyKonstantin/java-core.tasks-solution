package com.lugowoy.tasks.arrays.determineTheNumberOfDifferentElementsInOneDimensionalArray;

/** Created by Konstantin Lugowoy on 28.05.2017. */

public class Array<T extends Number> {

    private T[] array;

    public Array() {
    }

    public Array(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

}
