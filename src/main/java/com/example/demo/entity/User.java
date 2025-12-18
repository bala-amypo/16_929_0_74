package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class User {
    
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
}
