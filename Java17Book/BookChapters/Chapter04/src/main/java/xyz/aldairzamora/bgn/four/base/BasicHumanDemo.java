package xyz.aldairzamora.bgn.four.base;

public class BasicHumanDemo {

    public static void main(String[] args) {

        // instantiate an object from a class
        Human aldair = new Human();
        //field currently have default values
        System.out.println(aldair.getName());
        System.out.println(aldair.getAge());
        System.out.println(aldair.getHeight());

        // set values using the setters method
        aldair.setAge(27);
        aldair.setName("Aldair");
        aldair.setHeight(1.72F);
        System.out.println("name: " + aldair.getName());
        System.out.println("age: " + aldair.getAge());
        System.out.println("height: " + aldair.getHeight());

        // local variable holds the value
        System.out.println(aldair.LIFESPAN);
        System.out.println(Human.LIFESPAN);

        // calling an object method
        int timeToLive = aldair.computeAndPrintttl();
        System.out.println("Time to live: " + timeToLive);

        // Initialize a new instance with a constructor with parameters
        Human antonio = new Human("Antonio", 27, 1.73F);
    }
}
