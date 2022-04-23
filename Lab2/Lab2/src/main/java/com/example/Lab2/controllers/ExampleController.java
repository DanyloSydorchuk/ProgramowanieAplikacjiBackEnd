package com.example.Lab2.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ExampleController {
    @RequestMapping("/example")
    public String example() {
        return "example";
    }
}
