package com.tomignoul.store.dto;

public class AddToCartRequest {
    private long productID;
    private int quantity;
    //constructors
    public AddToCartRequest() {
    }

    public AddToCartRequest(long productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
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
}
