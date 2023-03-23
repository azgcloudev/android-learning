package xyz.azgcloudev.jconstructors;

// Hero will inherit from Person class
// Inherit is not by default in Java, will need to use 'super'
public class Hero extends Person {

    int power;

    // CONSTRUCTOR
    public Hero(String name, int age, int power) {
        super(name, age); // use to inherit the properties from the Person class
        this.power = power;
    }
}
