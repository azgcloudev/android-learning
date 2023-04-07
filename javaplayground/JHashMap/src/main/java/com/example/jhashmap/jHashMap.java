package com.example.jhashmap;

import java.util.HashMap;

public class jHashMap {

    public static void main(String[] args) {

        // create a hashmap, need to import java.util.HashMap
        HashMap<String, Integer> playersPoints = new HashMap<>();

        playersPoints.put("aldair", 234);
        playersPoints.put("bastian", 432);
        playersPoints.put("leah", 523);

        // get a value based on the key
        System.out.println(playersPoints.get("aldair"));

        // loop all keys, using for-each
        for (String item : playersPoints.keySet()) {
            System.out.println(item);
        }


        // get all values, using for-each
        for (int value : playersPoints.values()) {
            System.out.println(value);
        }



        // get hashmap size
        System.out.println("Hash size is: " + playersPoints.size());


        // display key and value
        for (String key : playersPoints.keySet()) {
            System.out.println("Key: " + key + ", Value: " + playersPoints.get(key));
        }

        // remove a single key:value
        playersPoints.remove("aldair");


        // remove all
        playersPoints.clear(); // becomes null if any value doesn't exists
        System.out.println(playersPoints.get("aldair"));
    }
}