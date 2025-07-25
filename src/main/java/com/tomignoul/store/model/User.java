package com.tomignoul.store.model;
import jakarta.persistence.*;
import org.springframework.context.annotation.Import;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Embedded
    private Address address;
    private Long contactnumber;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    //foreign keys
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<CustomerOrder> orders;
    @OneToOne(mappedBy ="user", cascade = CascadeType.ALL)
    private Cart cart;


    //constructors


    public User(Long id, String firstName, String lastName, String email, Address address, Long contactnumber, String password, UserRole role, List<CustomerOrder> orders) {
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

    public Long getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(Long contactnumber) {
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

    public void setUserID(Long id) {
        this.id = id;
    }

    public Long getUserID() {
        return id;
    }
}
