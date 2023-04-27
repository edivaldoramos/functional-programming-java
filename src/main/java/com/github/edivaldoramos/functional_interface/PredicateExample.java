package com.github.edivaldoramos.functional_interface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate is a functional interface that represents a predicate (boolean-valued function) of one argument.
 * Is commonly used as an argument to filtering something
 */
public class PredicateExample {

    /**
     * A simple way to demonstrate how to use predicates
     */
    public static List<String> filter(List<String> values, Predicate<String> predicate) {
        return values.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}
