package com.example.demo.exception;

import java.util.*;

import org.springframework.http.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class globalExceptionHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException ex){
        Map<String,String> error = new HashMap<>();
        
        ex.getBindingResult().getFieldError().forEach( err -> error.put(err.getField() , err.getDefualtMessage()));

        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }

}
