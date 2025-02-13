
package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptop_id(101);
        laptop.setLaptop_brand("Acer");
        laptop.setLaptop_name("Predator");
        laptop.setLaptop_ram(16);

        Laptop laptop1 = new Laptop();
        laptop1.setLaptop_id(102);
        laptop1.setLaptop_brand("Dell");
        laptop1.setLaptop_name("XPS");
        laptop1.setLaptop_ram(16);

        Laptop laptop2 = new Laptop();
        laptop2.setLaptop_id(103);
        laptop2.setLaptop_brand("Apple");
        laptop2.setLaptop_name("MacBook Air");
        laptop2.setLaptop_ram(16);

        Alien alien = new Alien();
        alien.setAlien_name("Sandra");
        alien.setAlien_id(2);
        alien.setTech("Java");
//        alien.setLaptop(laptop);

        Alien alien2 = new Alien();
        alien2.setAlien_name("Peter");
        alien2.setAlien_id(1);
        alien2.setTech("Python");

        Alien alien3 = new Alien();
        alien3.setAlien_name("Andrew");
        alien3.setAlien_id(3);
        alien3.setTech("AI");

        alien.setLaptops(List.of(laptop, laptop1));
        alien2.setLaptops(List.of(laptop, laptop2));
        alien3.setLaptops(List.of(laptop2));

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Laptop.class)
                .addAnnotatedClass(Alien.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(laptop);
        session.persist(laptop1);
        session.persist(laptop2);
        session.persist(alien);
        session.persist(alien2);
        session.persist(alien3);

//        Alien alien4 = session.get(Alien.class, 1);
//        System.out.println(alien4);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
