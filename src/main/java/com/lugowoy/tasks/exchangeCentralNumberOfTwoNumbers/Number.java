package com.lugowoy.tasks.exchangeCentralNumberOfTwoNumbers;

import java.io.Serializable;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 05-Feb-17. */

public class Number implements Serializable, Cloneable {

    private int number;

    public Number() {
    }

    public Number(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return false;
        Number number1 = (Number) o;
        return getNumber() == number1.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString() {
        return "Number[" +
                "number=" + number +
                ']';
    }

    @Override
    public Number clone() throws CloneNotSupportedException {
        Number number = (Number) super.clone();
        number.setNumber(this.getNumber());
        return number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
