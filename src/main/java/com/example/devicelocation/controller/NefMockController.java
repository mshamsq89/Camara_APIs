package com.example.devicelocation.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nef")
public class NefMockController {

    @GetMapping("/location/{deviceId}")
    public String getLocation(@PathVariable String deviceId) {
        return "Mocked NEF location for " + deviceId + ": 48.8566°N, 2.3522°E";
    }
}
