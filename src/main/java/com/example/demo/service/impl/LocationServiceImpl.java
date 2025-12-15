package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRespository;
import com.example.demo.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    LocationRespository lrp;

    @Override
    public Location createLocation(Location location) {
        if(location.getLatitude() > 90){
            throw new IllegalArgumentException("latitude");
        }
       return lrp.save(location);
    }

    @Override
    public List<Location> getAllLocations() {
        return lrp.findAll();
    }
    
}
