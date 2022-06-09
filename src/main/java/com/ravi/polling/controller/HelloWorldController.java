package com.ravi.polling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/welcome")
    public String sayHello(){
        return "Hi there..";
    }

    @GetMapping("/")
    public String welcomePage(){
        return "Welcome";
    }
}
