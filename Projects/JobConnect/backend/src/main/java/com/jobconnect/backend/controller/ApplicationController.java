package com.jobconnect.backend.controller;

import com.jobconnect.backend.service.interf.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PatchMapping("/{id}/status")
    public ResponseEntity<Void> updateStatus(@PathVariable Long id, @RequestBody Map<String, String> body) {
        String status = body.get("status"); // e.g., "ACCEPTED" or "REJECTED"
        applicationService.updateApplicationStatus(id, status);
        return ResponseEntity.ok().build();
    }
}
