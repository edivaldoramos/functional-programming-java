package com.github.edivaldoramos.functional_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateExampleTest {
    @Test
    public void shouldReturnNamesThatStartWithLetterB() {
        List<String> names = Arrays.asList("Mark","Bill","Bob","Ada","Greg");

        Predicate<String> startsWithB = p -> p.startsWith("B");

        List<String> result = PredicateExample.filter(names, startsWithB);

        Assertions.assertEquals("Bill", result.get(0));
        Assertions.assertEquals("Bob", result.get(1));
    }

}