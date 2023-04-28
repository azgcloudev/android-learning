package com.apress.bgn.three.helloworld;

import java.util.List;

/**
 * @since 1.0-SNAPSHOT
 * @author iuliana.cosmina
 * @version 1.0-SNAPSHOT
 */
public class HelloWorld {
    public static void main(String... args) {

        // System.out.println("Hello " + args[0] + "!");
        List<String> items = List.of("1","a","2","a","3","a");
//
//        items.forEach(item -> {
//            if (item.equals("a")) {
//                System.out.println("A");
//            } else {
//                System.out.println("Not A");
//            }
//        });
        items.forEach(item -> System.out.println(item.equals("a") ? "A" : "Not A"));

    }
}
