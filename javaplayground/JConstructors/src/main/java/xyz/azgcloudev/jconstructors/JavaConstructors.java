package xyz.azgcloudev.jconstructors;

public class JavaConstructors {

    public static void main(String[] args) {

        Person person = new Person("Juan", 56);

        Hero superMan = new Hero("Super Man", 144, 3000);

        System.out.println(person.name);
        System.out.println(superMan.name);
    }
}