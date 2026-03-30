package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class TestController {
    
    @GetMapping("/")
    public String home() {
        return "Jenkins Test Application is Running!";
    }
    
    @GetMapping("/health")
    public String health() {
        return "OK - " + LocalDateTime.now();
    }
    
    @GetMapping("/test")
    public String test() {
        return "Jenkins Pipeline Test Successful!";
    }
}
