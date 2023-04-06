package com.example.objectsasmethodparameters;

public class MyClass {

    public static void main(String[] args) {

        Employee aldair = new Employee();

        aldair.setFirstName("Aldair");
        aldair.setMonthSalary(2000000);

        Employer msft = new Employer();
        msft.employeeDetails(aldair);
        msft.calculateAnualBonus(aldair);

        aldair.setLastName("Zamora");

        Employee william = new Employee();
        william.setFirstName("William");
        william.setLastName("Zamora");

        msft.areRelated(aldair, william);
    }
}