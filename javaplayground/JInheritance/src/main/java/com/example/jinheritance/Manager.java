package com.example.jinheritance;

public class Manager extends Employee {

    private String profile;

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return this.profile;
    }



    // override super class methods
    @Override
    public double getSalary() {
        return super.getSalary() + 300000;
    }

    @Override
    public int getId() {
        return super.getId() + 500;
    }

}
