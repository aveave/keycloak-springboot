package com.authorization.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestController {

    @GetMapping("/register")
    public ResponseEntity<String> signup() {
        return ResponseEntity.ok("Registration");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin() {
        System.out.println("inside");
        return ResponseEntity.ok("Hello Admin");
    }

    @RequestMapping("/protected")
    public String protectedHello() {
        return "Hello World, i was protected";
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Hello User");
    }
}
