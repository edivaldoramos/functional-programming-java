package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;
import com.github.edivaldoramos.enums.ProductType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Here we have an implementation example where a Predicate is used to filter the products
 * Predicate is a functional interface that represents a predicate (boolean-valued function) of one argument.
 *
 *  @see java.util.function.Predicate
 */
public class PredicateExample {

    /**
     * A simple way to demonstrate how to use predicates without stream for while
     */
    public static List<Product> filterProductByType(List<Product> products, ProductType type) {
        Predicate<Product> hasTypeShopping = p -> type.equals(p.getType());

        List<Product> filteredResults = new ArrayList<>();
        for (Product p : products){
            if (hasTypeShopping.test(p)) {
                filteredResults.add(p);
            }
        }

        return filteredResults;
    }

}
