package com.example.spring_security_demo.service;

import com.example.spring_security_demo.dao.UserRepo;
import com.example.spring_security_demo.model.User;
import com.example.spring_security_demo.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if(user == null){
            System.out.println("user not found");
            throw new UsernameNotFoundException("Error 404! user not found");
        }
        return new UserPrincipal(user);
    }
}
