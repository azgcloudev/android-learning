package com.example.jinheritance;

public class Employee extends Person {

    private int id;

    // CONSTRUCTORS
    public Employee() {

    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    // Getters and Setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
