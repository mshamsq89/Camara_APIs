package com.example.devicelocation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nef/qod/sessions")
public class MockNefQodController {

    @PostMapping
    public ResponseEntity<String> simulateCreate() {
        return ResponseEntity.ok("Mock NEF: Session created");
    }

    @DeleteMapping("/{sessionId}")
    public ResponseEntity<String> simulateDelete(@PathVariable String sessionId) {
        return ResponseEntity.ok("Mock NEF: Session deleted " + sessionId);
    }
}
