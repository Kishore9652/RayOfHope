package com.rehab.loginbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")  
public class loginController {

    
    private final String USERNAME = "rayofhope";
    private final String PASSWORD = "vikram1990";

    
    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password.");
        }
    }
}