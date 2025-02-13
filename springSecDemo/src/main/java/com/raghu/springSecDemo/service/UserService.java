package com.raghu.springSecDemo.service;

import com.raghu.springSecDemo.dao.UserRepo;
import com.raghu.springSecDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User addUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
