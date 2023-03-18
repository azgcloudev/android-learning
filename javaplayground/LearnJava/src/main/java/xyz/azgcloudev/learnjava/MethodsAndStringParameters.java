package xyz.azgcloudev.learnjava;

public class MethodsAndStringParameters {

    public static void main(String[] args) {

        showName();
        printMyInfo("Aldair", 27, true);
        System.out.println("Multiply");
        multiplyNumbers(21, 95);
        System.out.println("Division:");
        divideNumbeers(21, 95);
    }

    // method
    public static void showName() {
        System.out.println("Showing name..");
    }

    // String parameters
    public static void printMyInfo(String name, int age, boolean isAlive) {   //parameter name with type String
        if (isAlive) {
            System.out.println("I am " + name + " I have " + age + " years old");
        } else {
            System.out.println("Not alive");
        }
    }

    public static void multiplyNumbers(int a, int b) {
        System.out.println(a * b);
    }

    public static void divideNumbeers(double a, double b) {
        System.out.println(a / b);
    }
}
