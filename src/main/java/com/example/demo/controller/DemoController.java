package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(method = RequestMethod.GET, value = "/echo")
	public ResponseEntity<String> echo(@RequestParam String message) {
		return demoService.echo(message);
		//		System.out.println("echo Demo20171204");
//		return new ResponseEntity<String>( "echo Demo20171204", HttpStatus.OK);
	}

}
