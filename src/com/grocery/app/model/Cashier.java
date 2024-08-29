/*  This is Cashier and this is where the program starts
    The cashier should print a receipt in a separate file
 */
package com.grocery.app.model;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cashier {
    public static void main(String[] args) {

        //lagay tayo ng stock? to initialize available items
        //shop class? different itong cashier like it process and print receipt

        Customer customer1 = new Customer("Walter");
//        Product product1 = new Product(1, "Ketchup", BigDecimal.valueOf(250.00));
//        Cart cart1 = new Cart();

        customer1.putInCart(new Product());
        customer1.putInCart(new Product(1, "Ketchup", BigDecimal.valueOf(250.00),2));
        customer1.putInCart(new Product(2, "Mayo", BigDecimal.valueOf(300.00)));
        customer1.checkItemsInTheCart();
        customer1.checkTotalAmountInTheCart();
    }

    //swiping the items

    //tax computation

    /*  print receipt
        must include tax and vat
        then include them to the receipt
     */
    private void printReceipt() {

    }
}