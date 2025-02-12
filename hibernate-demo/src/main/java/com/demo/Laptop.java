package com.demo;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String laptop_brand;
    private String laptop_name;
    private int laptop_ram;

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

    @Override
    public String toString() {
        return "Laptop{" +
                "laptop_brand='" + laptop_brand + '\'' +
                ", laptop_name='" + laptop_name + '\'' +
                ", laptop_ram=" + laptop_ram +
                '}';
    }
}
