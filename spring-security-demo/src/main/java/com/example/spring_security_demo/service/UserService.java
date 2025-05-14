package com.example.spring_security_demo.service;

import com.example.spring_security_demo.dao.UserRepo;
import com.example.spring_security_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println("encrypted password:" +  user.getPassword());
        return userRepo.save(user);
    }
}
