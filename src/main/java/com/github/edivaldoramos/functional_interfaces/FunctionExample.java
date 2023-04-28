package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;
import com.github.edivaldoramos.enums.ProductType;
import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Here we have an implementation example where a Function is used to calculate a sell price of a product
 * Function is a functional interface that accepts one argument and produces a result.
 *
 *  @see java.util.function.Function
 */
public class FunctionExample {

    /**
     * This method calculates a sell price of the product passed as an argument
     */
    public static BigDecimal calculateSellPrice(Product product){
        Function<Product, BigDecimal> calculatorSellPrice = FunctionExample::apply;

        return calculatorSellPrice.apply(product);
    }

    private static BigDecimal apply(Product p) {
        if (ProductType.SHOPPING.equals(p.getType())) {
            return p.getCostValue().multiply(new BigDecimal("1.30"));
        }

        return p.getCostValue().multiply(new BigDecimal("1.10"));
    }

}
