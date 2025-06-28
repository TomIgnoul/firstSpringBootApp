package com.tomignoul.store.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderItemID;
    private int quantity;
    private BigDecimal price;

    //foreign Keys
    @ManyToOne
    @JoinColumn(name = "cartID")
    private Cart cart;
    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;

    //constructors
    public OrderItem(long orderItemID, int quantity, BigDecimal price, Cart cart, Product product) {
        this.orderItemID = orderItemID;
        this.quantity = quantity;
        this.price = price;
        this.cart = cart;
        this.product = product;
    }

    public OrderItem(){}

    //Getters & Setters

    public long getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(long orderItemID) {
        this.orderItemID = orderItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
