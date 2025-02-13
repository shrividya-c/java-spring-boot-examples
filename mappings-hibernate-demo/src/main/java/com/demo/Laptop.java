
package com.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private int laptop_id;
    private String laptop_brand;
    private String laptop_name;
    private int laptop_ram;

//    @ManyToOne
//    private Alien alien;

    @ManyToMany(mappedBy = "laptops")
    private List<Alien> alienList;

    public int getLaptop_id() {
        return laptop_id;
    }

    public void setLaptop_id(int laptop_id) {
        this.laptop_id = laptop_id;
    }

    public String getLaptop_brand() {
        return laptop_brand;
    }

    public void setLaptop_brand(String laptop_brand) {
        this.laptop_brand = laptop_brand;
    }

    public String getLaptop_name() {
        return laptop_name;
    }

    public void setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
    }

    public int getLaptop_ram() {
        return laptop_ram;
    }

    public void setLaptop_ram(int laptop_ram) {
        this.laptop_ram = laptop_ram;
    }

//    public Alien getAlien() {
//        return alien;
//    }
//
//    public void setAlien(Alien alien) {
//        this.alien = alien;
//    }


    public List<Alien> getAlienList() {
        return alienList;
    }

    public void setAlienList(List<Alien> alienList) {
        this.alienList = alienList;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptop_id=" + laptop_id +
                ", laptop_brand='" + laptop_brand + '\'' +
                ", laptop_name='" + laptop_name + '\'' +
                ", laptop_ram=" + laptop_ram +
                '}';
    }
}
