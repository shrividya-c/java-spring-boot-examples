package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); //bean creation
//        Desktop desktop = applicationContext.getBean(Desktop.class);
//        Desktop desktop = applicationContext.getBean("hello", Desktop.class);
//        desktop.compile();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig1.class);

//        System.out.println("1 -----------");
//        Alien alien = applicationContext.getBean("a1", Alien.class);
//        System.out.println("age:"+alien.getAge());
//        alien.code();
//        System.out.println("2 -----------");
//        Alien alien2 = applicationContext.getBean("a2", Alien.class);
//        System.out.println("age:"+alien2.getAge());
//        alien2.code();
//        System.out.println("3 -----------");
//        Alien alien3 = applicationContext.getBean("a3", Alien.class);
//        alien3.code();

        Alien alien = applicationContext.getBean(Alien.class);
        System.out.println("age:"+alien.getAge());
        alien.code();
    }
}
