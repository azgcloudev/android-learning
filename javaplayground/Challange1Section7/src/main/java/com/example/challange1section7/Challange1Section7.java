package com.example.challange1section7;

public class Challange1Section7 {


    public static void main(String[] args) {
        divideNumbers(21, 95);
        multiplyNumbers(21, 95);
    }

    //    create a function called divideNumbers() that takes two integers as parameters
    //    ( int firstNumber and int secondNumber ), and it will print out the quotient
    //    ( the result we get when we divide two numbers).
    public static void divideNumbers(int firstNumber, int secondNumber) {
        System.out.println((double) firstNumber / secondNumber);
    }


    //    create a second function called multiplyNumbers() that takes two integers as parameters
    //    ( int firstNumber and int secondNumber ), and it will print out the product
    //    ( the result we get when we multiply two numbers)
    public static void multiplyNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }
}