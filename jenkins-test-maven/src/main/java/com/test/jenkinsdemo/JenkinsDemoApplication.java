package com.test.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
        System.out.println("=== Jenkins Demo App Started on Java 21 ===");
    }
    
    @GetMapping("/")
    public String home() {
        return "Hello from Jenkins CI/CD Pipeline! Time: " + new java.util.Date();
    }
    
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
    
    @GetMapping("/test")
    public String test() {
        return "Pipeline test successful!";
    }
}
