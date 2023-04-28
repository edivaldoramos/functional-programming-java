package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;
import com.github.edivaldoramos.enums.ProductType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class PredicateExampleTest {

    @Test
    public void shouldReturnOnlyProductWithShoppingType() {
        List<Product> products = Arrays.asList(
          new Product(2L, ProductType.CONVENIENCE, new BigDecimal("23"), Boolean.TRUE),
          new Product(2L, ProductType.SHOPPING, new BigDecimal("15"), Boolean.TRUE),
          new Product(3L, ProductType.SHOPPING, new BigDecimal("41"), Boolean.TRUE)
        );

        List<Product> filteredProducts = PredicateExample.filterProductByType(products, ProductType.SHOPPING);

        Assertions.assertEquals(2, filteredProducts.size());
    }

}