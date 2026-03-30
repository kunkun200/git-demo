package com.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
        System.out.println("Jenkins Test Application Started!");
    }
}
