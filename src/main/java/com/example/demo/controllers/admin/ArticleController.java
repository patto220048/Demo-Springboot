package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("ArticleController")

public class ArticleController {
    @GetMapping(value="/acticle/{id}")
    public String detail(@PathVariable("id") Long id) {
        System.out.println("ID is: " + id);
        return "article/index";
    }
        
}
