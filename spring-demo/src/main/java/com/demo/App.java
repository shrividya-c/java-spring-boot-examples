package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); //object gets created here.. constructor executes here

        Alien alien = (Alien) applicationContext.getBean("alien1");
        System.out.println("age: " + alien.getAge());
//        alien.print();

//        Alien alien2 = (Alien) applicationContext.getBean("alien2");
//        alien2.print();
//        Alien alien3 = (Alien) applicationContext.getBean("alien1");
//        alien3.print();
//        Alien alien4 = (Alien) applicationContext.getBean("alien2");
//        alien4.print();

//        Laptop laptop = applicationContext.getBean(Laptop.class);
//        laptop.print();

        alien.code();
    }
}
