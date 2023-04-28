package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;
import com.github.edivaldoramos.enums.ProductType;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ConsumerExampleTest {

    @Test
    public void shouldJustCallPrintMethod() {
        Product product = new Product(
                10L,
                ProductType.SHOPPING,
                new BigDecimal("10"),
                Boolean.TRUE
        );

        ConsumerExample.printMessageWithProductData(product);
    }

}