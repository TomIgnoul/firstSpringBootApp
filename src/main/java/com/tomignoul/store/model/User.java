package com.tomignoul.store.model;
import jakarta.persistence.*;
import org.springframework.context.annotation.Import;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Embedded
    private Address address;
    private double contactnumber;
    private String password;
    private UserRole role;
    //foreign keys
    @OneToMany(mappedBy = "user")
    private List<CustomerOrder> orders;
    @OneToOne(mappedBy ="user")
    private Cart cart;


    //constructors


    public User(Long id, String firstName, String lastName, String email, Address address, double contactnumber, String password, UserRole role, List<CustomerOrder> orders) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.contactnumber = contactnumber;
        this.password = password;
        this.role = role;
        this.orders = orders;
    }

    public User() {}

    //Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(double contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
