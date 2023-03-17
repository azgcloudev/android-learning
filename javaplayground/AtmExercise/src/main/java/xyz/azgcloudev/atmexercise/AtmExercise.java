package xyz.azgcloudev.atmexercise;

public class AtmExercise {

    public static void main(String[] args) {
        /*
        1. Create a String variable called command, which can hold "Withdraw" or "Deposit" commands

        2. Create an int variable called balance, which holds 1000

        3. Create another int variable called amount, which holds 100

       If the command value is "Withdraw," then subtract the amount from balance and print out:

          "Your balance used to be 1000, and now is 900."

       If, instead, the command value is "Deposit," then print out:

           "Your balance used to be 1000, and now it is 1100."
         */

        String command = "Deposit";
        int balance = 1000;
        int amount = 100;

        int oldBalance;

        switch (command) {

            case "Widthdraw":
                oldBalance = balance;
                balance = balance - amount;
                System.out.println("Your balance used to be " + oldBalance + ", and now is " + balance + ".");
                break;
            case "Deposit":
                oldBalance = balance;
                balance += amount;
                System.out.println("Your balance used to be " + oldBalance + ", and now it is " + balance + ".");
                break;
            default:
                System.out.println("Wrong command");
                break;
        }

    }
}