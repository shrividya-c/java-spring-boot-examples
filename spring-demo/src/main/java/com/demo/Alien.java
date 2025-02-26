package com.demo;

public class Alien {
    private int age;

//    private Laptop laptop;
    private Computer computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter injection of age attribute called!");
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("setter injection using ref attribute");
//    }


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien() {
    }

    public Alien(int age){
        this.age = age;
        System.out.println("constructor injection!!");
    }

//    @ConstructorProperties({"age", "laptop"}) //for name in constructor-arg in spring.xml
//    public Alien(int age, Laptop laptop) {
//        this.age = age;
//        this.laptop = laptop;
//    }


    public Alien(int age, Computer computer) {
        this.age = age;
        this.computer = computer;
    }

    public void print(){
        System.out.println("alien prints");
    }

    public void code(){
        System.out.println("alien codes!");
//        laptop.compile();
        computer.compile();
    }

}
