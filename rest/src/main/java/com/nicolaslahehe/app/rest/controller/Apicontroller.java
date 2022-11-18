package com.nicolaslahehe.app.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Apicontroller {
    
    @GetMapping(value = "/")
    public String getpage() {
        return "Welcome to Dota, you suck!";
    }
}
