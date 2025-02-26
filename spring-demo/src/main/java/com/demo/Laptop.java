package com.demo;

public class Laptop implements Computer{
//    public Laptop(){
//        System.out.println("Laptop object created!");
//    }

    public void print(){
        System.out.println("Laptop prints!");
    }

    @Override
    public  void compile(){
        System.out.println("compiling from laptop");
    }
}
