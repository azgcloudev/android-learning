package xyz.azgcloudev.learnjava;

public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 34;
        int resultSum = a + b;

        System.out.println("The sum is " + resultSum);

        // + - * / %

        //division
        // int division = a / b;   // the result will be 0, which is wrong
        double division = (double) a / b;   // one value must be of the type do get a double result 20.0 / 34
        System.out.println("Division result is " + division);


        // remainder
        int remainder = b / a;
        System.out.println("The remainder of " + b + " / " + a + " is " + remainder);


        // relational operators
        /* ********
         *  --- RELATIONAL OPERATOR ---
         *   ! is NOT
         *   = is assigment
         *   == is comparison
         *  < is less than
         *  > is greater than
         *  <= is less than or equal
         *  >= is greater than or equal
         **********/


        /// if statements
        if (a == b) { // if the evaluation is true the run code block
            System.out.println("Running...");
        } else if (!true) {
            // evaluates if a is not true
        } else {
            System.out.println("Keep running.");
        }
    }
}
