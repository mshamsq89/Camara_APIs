package com.example.devicelocation.model;

public class LocationResponse {
    private String deviceId;
    private String result;

    // ✅ No-arg constructor
    public LocationResponse() {
    }

    // ✅ All-arg constructor
    public LocationResponse(String deviceId, String result) {
        this.deviceId = deviceId;
        this.result = result;
    }

    // ✅ Getters and Setters
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

