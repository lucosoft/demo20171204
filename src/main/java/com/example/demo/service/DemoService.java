package com.example.demo.service;

import org.springframework.http.ResponseEntity;

public interface DemoService {
    public ResponseEntity<String> echo(String message);
}
