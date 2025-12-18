package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.*;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime objcreatedAt;
   
 
     public LocalDateTime getObjcreatedAt() {
        return objcreatedAt;
    }
    public void setObjcreatedAt(LocalDateTime objcreatedAt) {
        this.objcreatedAt = objcreatedAt;
    }
    public User(Long id, String name, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime objcreatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.objcreatedAt = LocalDateTime.now();
    }
    
    @PrePersist
    public void onCreate(){
         createdAt = LocalDateTime.now();
    }


    @PreUpdate
    public void onUpdate(){
        updatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User() {
    
    }   
}
