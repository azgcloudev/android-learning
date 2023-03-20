package xyz.azgcloudev.learnjava;

public class ReturnTypes {

    public static void main(String[] args) {
        System.out.println(addNumber(5,3));

        System.out.println(fullName("Aldair", "Zamora"));

        System.out.println(nameInitial("Aldair"));
    }

    // return int
    public static int addNumber(int a , int b) {
        return a + b;
    }


    // return string
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // return a char
    public static char nameInitial(String name) {
        return name.charAt(0);
    }
}
