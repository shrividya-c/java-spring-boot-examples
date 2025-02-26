package com.demo;

public class Computer {
    private String name;
    public void computer(){
        System.out.println("computer object created");
    }

    public void compile(){
        System.out.println("compiling from computer");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
