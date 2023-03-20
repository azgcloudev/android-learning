package xyz.azgcloudev.learnjava;

public class ReturnTypes {

    public static void main(String[] args) {
        System.out.println(addNumber(5,3));

        System.out.println(fullName("Aldair", "Zamora"));

        System.out.println(nameInitial("Aldair"));

        // division
        double division = divideNumbers(234, 43);
        division++;
        System.out.println(division);


        String userBio = showBio("Aldair", "I love airplanes and motorcycles", 27);
        System.out.println(userBio);
    }

    // return int
    public static int addNumber(int a , int b) {
        return a + b;
    }


    // return string
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String showBio(String name, String bio, int age) {

        return "My name is "
                + name + " and I am " + age + " old. "
                + bio + ".";
    }

    // return a char
    public static char nameInitial(String name) {
        return name.charAt(0);
    }

    // return a double
    public static double divideNumbers(double first, double second) {
        return first / second;
    }
}
