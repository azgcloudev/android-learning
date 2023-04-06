package com.example.objectsasmethodparameters;

public class Employer {

    private String name;
    private String location;

    public Employer() {

    }

    public Employer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    // METHODS
    public void employeeDetails(Employee employee) {
        System.out.println("Employee " + employee.getFirstName()
                + " monthly salary is: " + employee.getMonthSalary()
        );
    }

    public void calculateAnualBonus(Employee employee) {
        double annualBonus = (employee.getMonthSalary() * 0.15) * 11;
    }

    public boolean areRelated(Employee employeeA, Employee employeeB) {

        if (employeeB.getLastName() == employeeA.getLastName()) {
            System.out.println(employeeA.getFirstName() + " is a related with " + employeeB.getFirstName());
            return true;
        } else {
            System.out.println(employeeA.getFirstName() + " is not related with " + employeeB.getFirstName());
            return false;
        }
    }
}
