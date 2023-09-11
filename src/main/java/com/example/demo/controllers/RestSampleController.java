package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RestSampleController {
    @GetMapping(value="/bye")
    public String bye(@RequestParam String param) {
        return "helllo " + param +" hahaha";
    }
    @GetMapping(value="/users/{userId}")
    public String getUserById(@PathVariable Long userId) {
        String msg = "User " + userId;
        return msg;
    }
    
    
}
