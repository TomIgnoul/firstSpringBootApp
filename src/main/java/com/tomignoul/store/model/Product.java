package com.tomignoul.store.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String name;
    private String description;
    private BigDecimal price;
    private double quantity;
    private String img;
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;
    @ManyToOne
    @JoinColumn(name = "categoryID")
    private Category category;
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
    //constructors
    public Product(long productId, String name,String description, BigDecimal price, double quantity, String img, User user, Category category) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.img = img;
        this.user = user;
        this.category = category;
    }
    public Product (){};

    // Getters & Setters

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
