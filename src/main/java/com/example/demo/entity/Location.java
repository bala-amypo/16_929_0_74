package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Location {
    
    
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

}
