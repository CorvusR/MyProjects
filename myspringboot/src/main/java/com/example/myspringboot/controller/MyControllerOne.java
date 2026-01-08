package com.example.myspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerOne {
    @GetMapping("/hello")
    public String hello() {

        return "hello world";
    }


}
