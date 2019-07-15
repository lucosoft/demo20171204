package com.example.demo.repository.impl;

import com.example.demo.repository.DemoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DemoRepositoryImpl implements DemoRepository {
    @Override
    public ResponseEntity<String> echo(String message) {
        return new ResponseEntity<String>( "Demo20171204 echo:" + message, HttpStatus.OK);
    }
}
