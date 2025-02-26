package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop extends Computer{
    @Value("hp desktop")
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Desktop(){
        System.out.println("Desktop object created!!");
    }

    public void compile(){
        System.out.println("compiling from desktop");
    }
}
