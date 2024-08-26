/*  this is Cart's characteristics.
    Cart should contains items inserted by customer

*/
package com.grocery.app.model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart {
    //private Product products;
    private ArrayList<Product> products;
    private BigDecimal totalPrice;
    //private Customer customer;

    public Cart() {
        this.totalPrice = BigDecimal.ZERO;
        this.products = new ArrayList<>();
    }

    //get current total amount in the cart
    public BigDecimal getTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for(Product product: this.products) {
            total = total.add(product.getPrice()).multiply(BigDecimal.valueOf(product.getQuantity()));
        }
        System.out.println("Total amount: " + total);
        return this.totalPrice = total;
    }

    //add items inside cart
    public Product addItems(Product product) {
        //Product product = new Product(i, productName, price);
        products.add(product);
        return product;
    }

    //remove items in the cart

    //check items in the cart
    public void checkItemList() {
        this.products.forEach(System.out::println);
    }
}
