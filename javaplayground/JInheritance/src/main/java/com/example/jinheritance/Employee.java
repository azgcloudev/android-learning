package com.example.jinheritance;

public class Employee extends Person {

    private int id;
    private double salary;

    // CONSTRUCTORS
    public Employee() {

    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(String firstName, String lastName,double salary) {

        super(firstName, lastName);
        this.salary = salary;
    }

    // Getters and Setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}
