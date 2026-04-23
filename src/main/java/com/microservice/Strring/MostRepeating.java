package com.microservice.Strring;

import java.util.HashMap;
import java.util.Map;

public class MostRepeating {
    public static void main(String[] args) {
        String string = "sheikh";
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : string.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;

        // Find max repeating character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Most repeating character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }
}