package com.example.songr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String getHomepage() {
        return "Hello, this is home page";
    }
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World";
    }
    @GetMapping("/capitalize/{string}")
    public String getCapitalizedString(@PathVariable String string) {
        return string.toUpperCase();
    }
}
