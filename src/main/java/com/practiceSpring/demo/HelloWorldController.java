package com.practiceSpring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* tells spring this class is gonna deal with http requests and return http responses
without it spring will think that you wanna return an HTML page
*/
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello") //tells spring when an HTTP GET request arrive on /hello to execute the method
    public String helloWorld(){
        return "Hello World!";
    }
}
