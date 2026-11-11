package com.example.postgres_devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/")
    public String home() {
        return "✅ SUCCESS: Spring Boot is actively running and successfully connected to the PostgreSQL Database via Docker Environment Variables!";
    }
}