package xyz.azgcloudev.learnjava;

public class Loops {

    public static void main(String[] args) {

        //  === for loop ===
        for (int i = 0; i < 10; i++) {
            System.out.println("Counter is " + i);
        }

        // display numbers only even
        System.out.println(""); // empty line
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is multiple of 2");
            }
        }
    }
}
