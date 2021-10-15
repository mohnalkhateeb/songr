package com.example.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {
    @GetMapping ("/")
    public String getHomepage(Model model) {
        model.addAttribute("message","Hello, this is home page");
        return "Index";
    }
    @ResponseBody
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @ResponseBody
    @GetMapping("/capitalize/{string}")
    public String getCapitalizedString(@PathVariable String string) {
        return string.toUpperCase();
    }


}
