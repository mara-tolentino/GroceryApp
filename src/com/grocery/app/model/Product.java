//this describes Product and its characteristics

package com.grocery.app.model;

import java.math.BigDecimal;

public class Product {
    private int itemNo;
    private String name;
    private BigDecimal price;
    private int quantity;

    public Product() {
        this(0, "no name", BigDecimal.ZERO);
    }

    public Product(int itemNo, String name, BigDecimal price) {
        this(itemNo,name,price, 1);
    }

    public Product(int itemNo, String name, BigDecimal price, int quantity) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item number=" + itemNo +
                ", x" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
