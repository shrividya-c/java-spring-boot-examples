package com.demo.app.service;

import com.demo.app.model.Laptop;
import com.demo.app.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    private Laptop laptop;

    @Autowired
    private LaptopRepository laptopRepository;

    public void saveLaptop(){
        System.out.println("executing service class!");
        laptopRepository.save(laptop);
    }
}
