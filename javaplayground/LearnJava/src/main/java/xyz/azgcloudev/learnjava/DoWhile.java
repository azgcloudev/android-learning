package xyz.azgcloudev.learnjava;

import java.sql.SQLOutput;

public class DoWhile {

    // the loop runs at least once and then check the while condition

    public static void main(String[] args) {
        int limit = 1;
        int counter = 1;

        do {
            System.out.println("counter is " + counter);
            counter++;
            limit++;
        } while (limit <= 10);
    }


}
