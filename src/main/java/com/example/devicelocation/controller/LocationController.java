package com.example.devicelocation.controller;

import com.example.devicelocation.model.LocationRequest;
import com.example.devicelocation.model.LocationResponse;
import com.example.devicelocation.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/verify")
    public LocationResponse verifyLocation(@RequestBody LocationRequest request) {
        return locationService.verify(request);
    }

    @GetMapping("/retrieve/{deviceId}")
    public LocationResponse retrieveLocation(@PathVariable("deviceId")  String deviceId) {
        return locationService.retrieve(deviceId);
    }
}
