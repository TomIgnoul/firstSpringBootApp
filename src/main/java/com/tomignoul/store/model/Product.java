package com.tomignoul.store.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String description;
    private BigDecimal price;
    private double quantity;
    private String img;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany(mappedBy = "productID")
    private List<OrderItem> orderItems;
    //constructors
    public Product(long productId, String description, BigDecimal price, double quantity, String img, User user, Category category) {
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

    public long getproductId() {
        return productId;
    }

    public void setproductId(long productId) {
        this.productId = productId;
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
