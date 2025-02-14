package com.example.hotelapi.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Contact {
    private String phoneNumber;
    private String email;

    // Getters and setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}