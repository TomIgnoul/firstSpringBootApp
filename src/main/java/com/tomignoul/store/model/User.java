package com.tomignoul.store.model;
import jakarta.persistence.Embedded;
import org.springframework.context.annotation.Import;


public class User {
    private String firstName;
    private String lastName;
    private String email;
    @Embedded
    private Address address;
    private double contactnumber;
    private String password;
    private UserRole role;

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
}
