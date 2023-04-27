package com.github.edivaldoramos.functional_interface;

import java.util.function.Function;

/**
 * Function is a functional interface that accepts one argument and produces a result.
 * Is commonly used for data transformation
 */
public class FunctionExample {
    /**
     * Return the value length
     */
    public static Integer getStringLength(String value){
        Function<String, Integer> lengthFunction = String::length;
        return lengthFunction.apply(value);
    }
}
