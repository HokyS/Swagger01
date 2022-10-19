package com.example.Swagger01.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class MyController {

    @GetMapping(value = "")
    @ApiOperation(value = "MyController", notes = "SuperMirkoPlus")
    public String controller(){
        return "SuperMirkoPlus";
    }
}
