package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;

import java.util.function.Supplier;

/**
 * Here we have an implementation example where a Supplier is used to create a description of a product
 * Supplier is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
 *
 *  @see java.util.function.Supplier
 */
public class SupplierExample {

    public static String buildProductDescription(Product product) {
        Supplier<String> buildDescriptionSupplier = () -> String.format(
                "The product with id %d, has a cost value of %.2f, its type is %s and it is %s",
                product.getId(), product.getCostValue(), product.getType(), product.getActive() ? "active" : "inactive"
        );

        return buildDescriptionSupplier.get();
    }

}
