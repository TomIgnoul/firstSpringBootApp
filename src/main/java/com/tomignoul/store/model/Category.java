package com.tomignoul.store.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Category") // tabelnaam in DB (met hoofdletter)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID") // kolomnaam in DB
    private long id;

    @Column(name = "CategoryName") // kolomnaam in DB
    private String categoryName;

    // constructors
    public Category() {}

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    // getters & setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

