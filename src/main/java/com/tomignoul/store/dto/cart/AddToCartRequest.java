package com.tomignoul.store.dto.cart;

public class AddToCartRequest {
    private long productID;
    private int quantity;
    private long userID;
    //constructors
    public AddToCartRequest() {
    }

    public AddToCartRequest(long productID, int quantity, long userID) {
        this.productID = productID;
        this.quantity = quantity;
        this.userID =  userID;
    }

    //Setters & Getters

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
}
