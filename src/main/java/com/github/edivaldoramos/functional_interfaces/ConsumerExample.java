package com.github.edivaldoramos.functional_interfaces;

import com.github.edivaldoramos.dto.Product;

import java.util.function.Consumer;

/**
 * Here we have an implementation example where a Consumer is used to print a text
 * Consumer is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
 *
 * @see java.util.function.Consumer
 */
public class ConsumerExample {

    /**
     * This method builds a message with product data and prints it
     */
   public static void printMessageWithProductData(Product product){
       Consumer<Product> printerConsumer = p -> System.out.printf(
               "The product with id %d, has a cost value of %.2f, its type is %s and it is %s",
               p.getId(),
               p.getCostValue(),
               p.getType(),
               p.getActive() ? "active" : "inactive"
       );

       printerConsumer.accept(product);
   }

}
