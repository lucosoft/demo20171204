package com.example.demo.service;

import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("DemoService")
public class DemoServiceImpl implements DemoService {

    private DemoRepository demoRepository;

    @Autowired
    public DemoServiceImpl(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public ResponseEntity<String> echo(String message) {
        return demoRepository.echo(message);
    }
}
