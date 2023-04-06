package com.example.datastructures;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        // Arrays are fixed length
        // define and initialize an int array
        int[] myArray = {1, 44, 6, 24};
        System.out.println(myArray[3]); // access by index number

        String[] names = {
                "James",
                "Anthony",
                "Rodrigo",
                "Niraj"
        };
        System.out.println(names[2]);


        // loop through the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Items: " + myArray[i]);
        }

        // empty array and its size
        int[] newArray = new int[4];
        String[] newNames = new String[2];

        newNames[0] = "Aldair";
        newNames[1] = "Antonio";
        // newNames[2] = "Error"; // this is not valid since array length is 2


        // === ARRAY LISTS ===
        ArrayList<String> myNames = new ArrayList<>();


        myNames.add("Antonio");
        myNames.add(0, "Aldair");

        // With this can hold different types
        ArrayList myObjects = new ArrayList();
        myObjects.add("Car");
        myObjects.add(21);
        myObjects.add(true);

        System.out.println("Index 0 value is " + myObjects.get(0));
        System.out.println(myObjects);

        // loop through arraylists
        int arrLen = myObjects.size();

        for (int i = 0; i < arrLen; i++) {
            System.out.println(myObjects.get(i));
        }

        // clever loop
        for (String value : myNames) {
            System.out.println(value);
        }


        // arrays as method parameters
        int[] arrNums = {1, 2, 3, 4, 56, 3456, 324, 675, 32, 342, 1, 3467, 78, 34, 2345, 7};
        findMultThree(arrNums);
    }









    public static void findMultThree(int[] nums) {

        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 3 == 0) {
                    System.out.println(nums[i] + " is a multiple of 3");
                } else {
                    System.out.println(nums[i] + " is not a multiple of 3");
                }
            }
        } else {
            System.out.println("Empty array");
        }
    }
}