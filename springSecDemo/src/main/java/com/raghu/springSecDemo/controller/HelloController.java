package com.raghu.springSecDemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("home")
    public String homepage(HttpServletRequest request){
        return "Hello World " + request.getSession().getId();
    }

    @GetMapping("about")
    public String contact(HttpServletRequest request){
        return "raghuvamshikodali@krv.com " + request.getSession().getId();
    }

    @GetMapping("name")
    public String name(HttpServletRequest request){
        return "Raghu " + request.getSession().getId();
    }
}
