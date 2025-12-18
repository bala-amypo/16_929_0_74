package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime objCreatedAt;
    private LocalDateTime createdAt;
 

  
    public User() {
        this.objCreatedAt = LocalDateTime.now();
    }

    public User(String name) {
        this.name = name;
        this.objCreatedAt = LocalDateTime.now();
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }



    public Long getId() {
        return id;
    }

    public LocalDateTime getObjCreatedAt() {
        return objCreatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
