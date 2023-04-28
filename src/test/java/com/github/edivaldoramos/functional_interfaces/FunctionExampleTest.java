package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;
import com.github.edivaldoramos.enums.ProductType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class FunctionExampleTest {

    @Test
    public void shouldSuccessfullyCalculateSellPriceOfTheProduct() {
        Product product = new Product(
                1L,
                ProductType.SHOPPING,
                new BigDecimal("25"),
                Boolean.TRUE
        );

        BigDecimal sellPrice = FunctionExample.calculateSellPrice(product);

        Assertions.assertEquals(new BigDecimal("32.50"), sellPrice);
    }

}