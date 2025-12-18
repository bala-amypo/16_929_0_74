package com.example.demo.service;

import com.example.demo.entity.*;

import jakarta.validation.Valid;

import java.util.*;

import org.springframework.web.bind.annotation.PathVariable;


public interface StudentService {

     List<studentEntity> getAll();

     studentEntity addStudent(studentEntity student);

     studentEntity getbyId(Long id);

     studentEntity updateById(Long id,studentEntity newstu);
}