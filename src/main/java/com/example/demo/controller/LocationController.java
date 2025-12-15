package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {

    
    LocationService locationService;

    LocationController(LocationService locationService){
        this.locationService = locationService;
    }

    @GetMapping("/locations")
    public List<Location> getAllLocation(){
        return locationService.getAllLocations();
    }

    @PostMapping("/locations")
}
