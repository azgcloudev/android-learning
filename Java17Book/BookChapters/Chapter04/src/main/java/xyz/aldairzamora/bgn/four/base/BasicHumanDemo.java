package xyz.aldairzamora.bgn.four.base;

import xyz.aldairzamora.bgn.four.classes.Gender;
import xyz.aldairzamora.bgn.four.classes.Musician;

public class BasicHumanDemo {

    public static void main(String[] args) {

        // commenting out all because the Human class now is abstract and cannot
        // be use to instantiate objects

//        // instantiate an object from a class
//        Human aldair = new Human();
//        //field currently have default values
//        System.out.println(aldair.getName());
//        System.out.println(aldair.getAge());
//        System.out.println(aldair.getHeight());
//
//        // set values using the setters method
//        aldair.setAge(27);
//        aldair.setName("Aldair");
//        aldair.setHeight(1.72F);
//        System.out.println("name: " + aldair.getName());
//        System.out.println("age: " + aldair.getAge());
//        System.out.println("height: " + aldair.getHeight());
//
//        // local variable holds the value
//        System.out.println(aldair.LIFESPAN);
//        System.out.println(Human.LIFESPAN);
//
//        // calling an object method
//        int timeToLive = aldair.computeAndPrintttl();
//        System.out.println("Time to live: " + timeToLive);
//
//        // Initialize a new instance with a constructor with parameters
//        Human antonio = new Human("Antonio", 27, 1.73F);


        for (Gender value : Gender.values()) {
            System.out.println(value.getClass());
        }

        Musician aldair = new Musician("Aldair", 27, 1.72F, "La Salle", "Rock");
        aldair.setGender(Gender.MALE);
        System.out.println(aldair.getGender());
    }
}
