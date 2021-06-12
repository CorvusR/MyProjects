package com.corvus.controller;

import com.corvus.beans.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(Users.class)
public class Controllers {

    @RequestMapping(value = "/method", method = RequestMethod.GET)
    public String getMethod() {
        return "get";
    }

    @RequestMapping(value = "/method", method = RequestMethod.POST)
    public String postMethod() {
        return "post";
    }

    @RequestMapping(value = "/method", method = RequestMethod.PUT)
    public String putMethod() {
        return "put";
    }

    @RequestMapping(value = "/method", method = RequestMethod.DELETE)
    public String deleteMethod() {
        return "delete";
    }

}
