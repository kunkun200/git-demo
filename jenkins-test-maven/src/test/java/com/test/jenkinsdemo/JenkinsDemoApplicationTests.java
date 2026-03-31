package com.test.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JenkinsDemoApplicationTests {
    
    @Autowired
    private TestRestTemplate restTemplate;
    
    @Test
    void contextLoads() {
        assertThat(restTemplate).isNotNull();
    }
    
    @Test
    void testHomeEndpoint() {
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
        assertThat(response.getBody()).contains("Hello from Jenkins");
    }
    
    @Test
    void testHealthEndpoint() {
        ResponseEntity<String> response = restTemplate.getForEntity("/health", String.class);
        assertThat(response.getBody()).isEqualTo("OK");
    }
}
