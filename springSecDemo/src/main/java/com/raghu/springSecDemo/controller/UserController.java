package com.raghu.springSecDemo.controller;

import com.raghu.springSecDemo.model.User;
import com.raghu.springSecDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }
}
