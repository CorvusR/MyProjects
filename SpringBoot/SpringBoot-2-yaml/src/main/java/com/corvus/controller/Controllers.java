package com.corvus.controller;

import com.corvus.beans.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(Users.class)
public class Controllers {

    @Autowired
    Users users;

    @RequestMapping("/user")
    public Users users() {
        return users;
    }

}
