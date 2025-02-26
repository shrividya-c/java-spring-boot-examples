package com.demo.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("compiling from laptop!");
    }
}
