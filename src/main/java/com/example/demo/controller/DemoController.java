package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demos")
public class DemoController {

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public ResponseEntity<String> home(@RequestParam String message) {
		System.out.println("Test Demo20171204");
		return new ResponseEntity<String>( "Test Demo20171204", HttpStatus.OK);
	}

}
