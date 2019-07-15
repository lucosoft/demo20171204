package com.example.demo.service;

import org.springframework.http.ResponseEntity;

public interface DemoService {
    ResponseEntity<String> echo(String message);
}
