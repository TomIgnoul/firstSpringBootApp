package com.tomignoul.store.model;

import jakarta.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartID;
    //foreign key
    @OneToOne
    @JoinColumn(name = "userID")
    private User user;

    //constructors

    public Cart(long cartID, User user) {
        this.cartID = cartID;
        this.user = user;
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
}
