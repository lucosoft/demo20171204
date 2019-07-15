package com.example.demo.repository;

import org.springframework.http.ResponseEntity;

public interface DemoRepository {
    ResponseEntity<String> echo(String message);

}
