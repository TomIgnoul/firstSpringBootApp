package com.tomignoul.store.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long orderId;
    private BigDecimal totalAmount;
    @Column(name = "OrderDate", updatable = false, insertable = false)
    private LocalDateTime orderDate;
    @ManyToOne
    @JoinColumn(name= "UserID")
    private User user;

    //constructors
    public CustomerOrder(BigDecimal totalAmount, LocalDateTime orderDate, User user) {
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.user = user;
    }

    public CustomerOrder(){}

    //Getters & Setters

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
