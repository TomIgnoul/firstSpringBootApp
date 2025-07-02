package com.tomignoul.store.dto;

import com.tomignoul.store.model.Category;

import java.math.BigDecimal;

public class AddProductRequest {
    private String description;
    private BigDecimal price;
    private double quantity;
    private String img;
    private Category category;
    private long userID;
    private long productID;

    public AddProductRequest(){};
    public AddProductRequest(String description,
                          BigDecimal price, double quantity,
                          String img, Category category,
                          long userID, long productID
    ){
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.img=img;
        this.category=category;
        this.userID=userID;
        this.productID=productID;
    }


    //Getters & Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID){
        this.userID=userID;
    }

    public long getProductID() {
        return productID;
    }
    public void setProductID(long productID){
        this.productID=productID;
    }
}
