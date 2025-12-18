package com.example.demo.repository ;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<User,Long> {
    
}
