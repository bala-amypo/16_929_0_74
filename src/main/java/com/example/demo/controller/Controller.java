package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.repo;

@RestController
public class Controller {

    @Autowired
    repo r;
    
    @PostMapping("/add")
    public User add(@RequestBody User user){
        return r.save(user);
    }
}
