package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController annotation in order to simplify the creation of RESTful web services. 
// It's a convenient annotation that combines @Controller and @ResponseBody, which eliminates the 
// need to annotate every request handling method of the controller class with the @ResponseBody annotation.

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @GetMapping -> Annotation for mapping HTTP GET requests onto specific handler methods.
	// @RequestParam to extract query parameters, form parameters, and even files from the request
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
