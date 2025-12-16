package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {

    @Autowired
        LocationService locationService;

            @GetMapping("/locations")
                public List<Location> getAllLocation(){
                        return locationService.getAllLocations();
                            }

                                @PostMapping("/locations")
                                    public Location createLocation(@RequestBody Location loc){
                                            return locationService.createLocation(loc);
                                                }
                                                }
                                                