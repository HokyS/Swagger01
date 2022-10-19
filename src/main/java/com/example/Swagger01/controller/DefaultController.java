package com.example.Swagger01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping(value = "")
    public String defaultController(){
        return "Welcome to localhost:1234 SUPERMIRKOPLUS8000";
    }
}
