package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;
import com.github.edivaldoramos.enums.ProductType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class SupplierExampleTest {

    @Test
    public void shouldReturnACompleteDescriptionMessageAboutTheProduct(){
        Product product = new Product(
                1L,
                ProductType.CONVENIENCE,
                new BigDecimal("11"),
                Boolean.TRUE
        );
        String message = SupplierExample.buildProductDescription(product);

        Assertions.assertEquals("The product with id 1, has a cost value of 11,00, its type is CONVENIENCE and it is active", message);
    }

}