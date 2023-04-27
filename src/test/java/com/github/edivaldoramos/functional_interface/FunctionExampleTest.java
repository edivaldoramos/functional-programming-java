package com.github.edivaldoramos.functional_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionExampleTest {

    @Test
    public void shouldSuccessfullyReturnStringLength() {
        String id = "1209-23120380121-8493";
        Integer length = FunctionExample.getStringLength(id);

        Assertions.assertEquals(21, length);
    }

}