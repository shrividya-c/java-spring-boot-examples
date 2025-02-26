//package com.demo;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class AppConfig {
//
//    @Bean
//    public Desktop desktop(){
//        Desktop d = new Desktop();
//        d.setName("dell desktop");
//        return d;
//    }
//
//    //    @Bean(name = {"hello","com"}) //customised bean names
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop1(){
//        Desktop dtp = new Desktop();
//        dtp.setName("hp desktop");
//        return dtp;
//    }
//
//    @Bean
//    public Desktop desktop2(){
//        Desktop dtp = new Desktop();
//        dtp.setName("acer desktop");
//        return dtp;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        Laptop l1 = new Laptop();
//        l1.setName("acer laptop");
//        return l1;
//    }
//
//    @Bean
//    public Laptop laptop1(){
//        Laptop l1 = new Laptop();
//        l1.setName("macbook");
//        return l1;
//    }
//
//
//    @Bean
////    @Scope("prototype") // bean will be created only by call getBean() method
//    public Alien a1(){
//        Alien a = new Alien();
//        a.setAge(26);
//        a.setComputer(desktop());
//        return a;
//    }
//
//    @Bean
//    public Alien a2(Computer computer){
//        Alien a2 = new Alien();
//        a2.setAge(30);
//        a2.setComputer(computer);
//        return a2;
//    }
//
//    @Bean
//    public Alien a3(@Qualifier("laptop1") Computer computer){
//        Alien a2 = new Alien();
//        a2.setComputer(computer);
//        return a2;
//    }
//}
