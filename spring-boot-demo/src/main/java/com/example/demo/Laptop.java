package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    private CPU cpu;

    public void compile(){
        System.out.println("compiling...");
        cpu.cpu();
    }
}
