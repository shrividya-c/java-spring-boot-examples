package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop extends Computer{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void compile(){
        System.out.println("compiling from laptop");
    }

    public Laptop() {
        System.out.println("laptop object created!");
    }
}
