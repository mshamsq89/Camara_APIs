package com.example.devicelocation.service;

import com.example.devicelocation.model.LocationRequest;
import com.example.devicelocation.model.LocationResponse;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    public LocationResponse verify(LocationRequest request) {
        boolean inside = request.getRadius() < 1000;
        return new LocationResponse(request.getDeviceId(), inside ? "INSIDE" : "OUTSIDE");
    }

    public LocationResponse retrieve(String deviceId) {
        return new LocationResponse(deviceId, "51.5074°N, 0.1278°W at 2025-07-11T10:00:00Z");
    }
}
