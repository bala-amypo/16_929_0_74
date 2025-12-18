package com.example.demo.exception;

class StudentNotFoundException extends RuntimeException{

    StudentNotFoundException(String errMsg){
        super(errMsg);
    }
}