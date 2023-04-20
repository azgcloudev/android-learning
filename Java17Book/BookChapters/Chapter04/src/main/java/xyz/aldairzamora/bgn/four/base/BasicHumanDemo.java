package xyz.aldairzamora.bgn.four.base;

public class BasicHumanDemo {

    public static void main(String[] args) {

        // instantiate an object from a class
        Human aldair = new Human();
        //field currently have default values
        System.out.println(aldair.name);
        System.out.println(aldair.age);
        System.out.println(aldair.height);

        // local variable holds the value
        System.out.println(aldair.LIFESPAN);
        System.out.println(Human.LIFESPAN);
        
    }
}
