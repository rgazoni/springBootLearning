// A key difference between a traditional MVC controller and the RESTful web
// service controller shown earlier is the way that the HTTP response body 
// is created. Rather than relying on a view technology to perform server-side
// rendering of the greeting data to HTML, this RESTful web service controller
// populates and returns a Greeting object. The object data will be written 
// directly to the HTTP response as JSON.
package com.example.restfulws;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//This code uses Spring @RestController annotation, which marks the class as
// a controller where every method returns a domain object instead of a view
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // annotation ensures that HTTP GET requests to /greeting are mapped to
    // greeting()
    @GetMapping("/greeting")
    // RequestParam binds the value of the query string parameter name into the name
    // parameter. If the name parameter is absent in the request, the defaultValue
    // of World is used.
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
