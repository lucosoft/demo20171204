package com.example.demo.repository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public ResponseEntity<String> echo(String message) {
        return new ResponseEntity<String>( "Demo20171204 echo:" + message, HttpStatus.OK);
    }
}
