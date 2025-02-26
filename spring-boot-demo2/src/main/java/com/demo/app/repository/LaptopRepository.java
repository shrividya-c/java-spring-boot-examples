package com.demo.app.repository;

import com.demo.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Saved to database!");
    }
}
