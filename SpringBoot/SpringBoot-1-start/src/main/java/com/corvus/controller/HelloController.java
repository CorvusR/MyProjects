package com.corvus.controller;

import com.corvus.beans.PropertyTest;
import com.corvus.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    User user;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello,world!";
    }

 /*   @RequestMapping("/bitch")
    public String whoring() {
        return propertyTest.toString();
    }*/

    @RequestMapping("/user")
    public User user() {
        return user;
    }
}
