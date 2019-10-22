package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
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
	
	@EndpointInject(uri = "geocoder:address:current")
	private FluentProducerTemplate producer;

	@RequestMapping(method = RequestMethod.GET, value = "/echo")
	public ResponseEntity<String> echo(@RequestParam String message) {
		return demoService.echo(message);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello",
					produces = "text/plain")
	public String hello() {
		String where = producer.request(String.class);
		return "Hello from Spring Boot and Camel. We are at: " + where;
	}
	
}
