package com.raghu.springSecDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/api/secured-endpoint")
    public String securedMessage() {
        return "✅ You have accessed a secured endpoint!";
    }
}
