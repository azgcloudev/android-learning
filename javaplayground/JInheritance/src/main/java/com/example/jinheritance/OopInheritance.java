package com.example.jinheritance;

public class OopInheritance {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Aldair");
        System.out.println(person.getFirstName());

        // object inherited from person
        Employee aldair = new Employee();
        aldair.setFirstName("Aldair");
        aldair.setId(12345);
        System.out.println(aldair.getId());

        // object inherited from Employee which is inherited from person
        Manager jose = new Manager();
        jose.setProfile("ANP");
        jose.setFirstName("Jose");
        System.out.println(jose.getFirstName());

        Employee antonio = new Employee("Antonio", "Zamora");
    }
}