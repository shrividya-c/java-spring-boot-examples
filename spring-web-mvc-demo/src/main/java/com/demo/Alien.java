package com.demo;

public class Alien {
    private int aid;
    private String aname;

    //getters and setters
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }

    //toString
    @Override
    public String toString() {
        return "com.demo.Alien [aid=" + aid + ", aname=" + aname + "]";
    }
}
