package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Laptop laptop;

    public void code(){
        System.out.println("alien is coding..");
        laptop.compile();
    }




}
