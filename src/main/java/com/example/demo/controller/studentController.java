package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;

@RestController
public class studentController {

    @Autowired
    

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll(){

    }
    
}
