package com.tomignoul.store.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartID;
    //foreign key
    @OneToOne
    @JoinColumn(name = "userID") //Cart has FK userID
    private User user;
    @OneToMany (mappedBy = "cart", cascade = CascadeType.ALL)
    private Set<OrderItem> orderItems;

    //constructors

    public Cart(long cartID, User user) {
        this.cartID = cartID;
        this.user = user;
        this.orderItems = new HashSet<>();
    }

    public Cart (){}

    //Getters & Setters

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
