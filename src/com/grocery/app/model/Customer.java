//this describes Customer and its characteristics

package com.grocery.app.model;

import java.math.BigDecimal;

public class Customer {
    private String name;
    private Cart cart;

    public Customer() {
        this("Anon");
    }

    public Customer(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    //add items in the cart
    public void putInCart(Product product) {
        cart.addItems(product);
    }

    //check items in the cart
    public void checkItemsInTheCart() {
        cart.checkItemList();
    }

    //check total amount in the cart
    public void checkTotalAmountInTheCart() {
        cart.getTotalPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer's name: " + name;
    }
}
