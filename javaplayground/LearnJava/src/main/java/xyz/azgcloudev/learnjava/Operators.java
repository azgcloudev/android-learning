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



        // logical operator
        /// operator AND
        int age = 18;
        boolean isCitizen = true;
        boolean notAFelon = false;

        // All the conditions must be true
        if (age >= 18 && isCitizen && notAFelon) {
            System.out.println("Can vote");
        } else {
            System.out.println("Can't vote");
        }


        // operator OR
           boolean isSnowing = false;

        // at least one condition must be true
        if ( a > b || isSnowing == false) {
            System.out.println("True sentence");
        } else {
            System.out.println("false sentence");
        }

        // operator NOT
        // returns the reverse value of the logical expression
        boolean isFUnny = true;

        if (!isFUnny) { // since isFUnny = true, the not resverse it to false
            System.out.println("Not funny");
        } else {
            System.out.println("Funny");
        }
    }
}
