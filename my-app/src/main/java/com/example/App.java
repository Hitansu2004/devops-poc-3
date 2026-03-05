package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/api/status")
    public String status() {
        String env = System.getenv("APP_ENV") != null ? System.getenv("APP_ENV") : "local";
        String version = System.getenv("APP_VERSION") != null ? System.getenv("APP_VERSION") : "dev";
        return String.format("POC 3 Backend is running! Environment: %s | Version: %s", env, version);
    }
}
