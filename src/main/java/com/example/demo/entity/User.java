package com.example.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import java.time.*;

@Entity
public class User {
    
    @Id
    @GeneratedValue = (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
`   private LocalDate currtime;

    @PrePersist
    public void setCurrTime(){
        currtime = LocalDate.now();
    }

    public User() {
    }
    

    
}
