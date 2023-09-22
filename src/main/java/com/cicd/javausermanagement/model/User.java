package com.cicd.javausermanagement.model;

public class User {
    private Long id;
    private String username;
    private String email;


    public User() {
        // Default constructor
    }

    // Getter methods

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

