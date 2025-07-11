package com.example.devicelocation.service;

import com.example.devicelocation.model.QoDSession;
import com.example.devicelocation.model.QoDSessionRequest;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class QoDService {

    private final Map<String, QoDSession> sessionStore = new ConcurrentHashMap<>();

    public QoDSession createSession(QoDSessionRequest request) {
        String sessionId = UUID.randomUUID().toString();
        QoDSession session = new QoDSession();
        session.setSessionId(sessionId);
        session.setDeviceId(request.getDeviceId());
        session.setStatus("ACTIVE");
        session.setStartTime(Instant.now().toString());
        sessionStore.put(sessionId, session);
        return session;
    }

    public Optional<QoDSession> getSession(String sessionId) {
        return Optional.ofNullable(sessionStore.get(sessionId));
    }

    public void deleteSession(String sessionId) {
        sessionStore.remove(sessionId);
    }
}
