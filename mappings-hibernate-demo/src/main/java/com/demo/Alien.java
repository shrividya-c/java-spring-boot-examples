
package com.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    private int alien_id;
    private String alien_name;
    private String tech;
//    @OneToOne
//    private Laptop laptop;

//    @OneToMany(mappedBy = "alien")
//    private List<Laptop> laptops;

    @ManyToMany
    private List<Laptop> laptops;

    public int getAlien_id() {
        return alien_id;
    }

    public void setAlien_id(int alien_id) {
        this.alien_id = alien_id;
    }

    public String getAlien_name() {
        return alien_name;
    }

    public void setAlien_name(String alien_name) {
        this.alien_name = alien_name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

//    @Override
//    public String toString() {
//        return "Alien{" +
//                "alien_id=" + alien_id +
//                ", alien_name='" + alien_name + '\'' +
//                ", tech='" + tech + '\'' +
//                ", laptop=" + laptop +
//                '}';
//    }


    @Override
    public String toString() {
        return "Alien{" +
                "alien_id=" + alien_id +
                ", alien_name='" + alien_name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
