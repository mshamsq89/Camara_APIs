package com.example.devicelocation.controller;

import com.example.devicelocation.model.QoDSession;
import com.example.devicelocation.model.QoDSessionRequest;
import com.example.devicelocation.service.QoDService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/qod/v1/sessions")
public class QoDController {

    private final QoDService qodService;

    public QoDController(QoDService qodService) {
        this.qodService = qodService;
    }

    @PostMapping
    public ResponseEntity<QoDSession> createSession(@RequestBody QoDSessionRequest request) {
        return ResponseEntity.ok(qodService.createSession(request));
    }

    @GetMapping("/{sessionId}")
    public ResponseEntity<QoDSession> getSession(@PathVariable("sessionId") String sessionId) {
        Optional<QoDSession> session = qodService.getSession(sessionId);
        return session.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{sessionId}")
    public ResponseEntity<Void> deleteSession(@PathVariable("sessionId") String sessionId) {
        qodService.deleteSession(sessionId);
        return ResponseEntity.noContent().build();
    }
}

