package xyz.azgcloudev.learnjava;

public class Variables {

    public static void main(String[] args) {

        // string
        String name = "Aldair";

        System.out.println("My name is " + name + "!!"); // string variable and concatenation

        // integer 32bits
        int age = 27;

        System.out.println("My age is " + age);

        // long, float and double
        long distance = 1898218743897L; // 64 bits
        float size = 1.72F; // 32 bits
        double PI = 3.1415345234; // more precision (64 bits)


        // byte, short  and char
        byte mByte = 127;   // 8 bits
        short mShort = 256; // 16 bits
        char letter = 'A';   // 16 bits - use single quotes


        // Booleans (true or false)
        boolean isAbove18 = true;

        System.out.println("Is over 18? " +isAbove18);

    }
}
