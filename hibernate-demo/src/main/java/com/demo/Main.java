package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentId(3);
        student.setName("rachel green");
        student.setAge(25);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);
        Session session;
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student); //save(insert)

        Student student2 = session.get(Student.class, 2); //find
        System.out.println(student2.toString());

        Student student_to_update = new Student(101, "shaan doe", 23);
        session.merge(student_to_update); //update or insert(save)

        Student student_to_delete = session.get(Student.class, 101);
        session.remove(student_to_delete); //delete


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}