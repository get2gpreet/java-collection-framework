package com.engineeringdigest.collectionframework.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(firstNonRepeating(s)); // Output: w
    }

    private static char firstNonRepeating(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '-';
    }
}
