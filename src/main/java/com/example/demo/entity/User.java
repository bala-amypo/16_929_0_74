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

    // Set by JPA lifecycle
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Used to compare object vs persistence lifecycle
    private LocalDateTime objcreatedAt;

    // Mandatory no-args constructor (used by Hibernate)
    public User() {
    }

    // Optional parameterized constructor (used manually, not by JPA)
    public User(String name) {
        this.name = name;
        this.objcreatedAt = LocalDateTime.now(); // object creation time
    }

    // Runs ONLY before INSERT
    @PrePersist
    public void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.objcreatedAt = now; // ensures not null after persist
    }

    // Runs ONLY before UPDATE
    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    // -------- Getters & Setters --------

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getObjcreatedAt() {
        return objcreatedAt;
    }

    public void setObjcreatedAt(LocalDateTime objcreatedAt) {
        this.objcreatedAt = objcreatedAt;
    }
}
