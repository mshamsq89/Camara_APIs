package com.example.devicelocation.model;

public class QoDSessionResponse {
    private String sessionId;
    private String status;

    public QoDSessionResponse() {}

    public QoDSessionResponse(String sessionId, String status) {
        this.sessionId = sessionId;
        this.status = status;
    }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

