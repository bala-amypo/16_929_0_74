package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Object lifecycle timestamp (Java object creation)
    private LocalDateTime objCreatedAt;

    // Persistence lifecycle timestamp (DB insert)
    private LocalDateTime createdAt;

    // DB update timestamp
    private LocalDateTime updatedAt;

    // 🔹 No-args constructor (MANDATORY for JPA)
    public User() {
        // Object creation time
        this.objCreatedAt = LocalDateTime.now();
    }

    // Optional constructor for clarity
    public User(String name) {
        this.name = name;
        this.objCreatedAt = LocalDateTime.now();
    }

    // 🔹 Runs only when entity is persisted
    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // 🔹 Runs only when entity is updated
    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    // ---------- Getters & Setters ----------

    public Long getId() {
        return id;
    }

    public LocalDateTime getObjCreatedAt() {
        return objCreatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
