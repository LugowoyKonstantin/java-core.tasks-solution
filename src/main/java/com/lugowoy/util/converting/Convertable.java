package com.lugowoy.util.converting;

/**
 * Created by Konstantin on 29-Jan-17.
 *
 * @author Konstantin
 * @version 1.0
 * @since 1.1
 * <p>
 * Interface "Convertable" declares the contract for the implementation of the convert.
 */
public interface Convertable<T> {

    /**
     * Is necessary to implement this method to perform the convert.
     *
     * @param t The object encapsulates the field to perform the convert.
     * @since 1.1
     */
    void convert(T t);
}