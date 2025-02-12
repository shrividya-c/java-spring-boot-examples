package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_embedable_demo {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptop_brand("Acer");
        laptop.setLaptop_name("Predator");
        laptop.setLaptop_ram(16);

        Alien alien = new Alien();
        alien.setAlien_name("Peter");
        alien.setAlien_id(1);
        alien.setTech("Java");
        alien.setLaptop(laptop);

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Alien.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(alien);

        Alien alien2 = session.get(Alien.class, 1);
        System.out.println(alien2);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
