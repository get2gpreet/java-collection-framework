package com.engineeringdigest.collectionframework.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {




    public static void main(String[] args) {
        //System.out.println(getFrequency("banana")); // {b=1, a=3, n=2}
        //System.out.println(getFrequencyByArray("banana"));
        Map<Character, Integer> banana = getFrequencyByArray("banana");
        banana.forEach((key, value) -> {
            System.out.print(key + " = ");
            System.out.println(value);
        });
    }

    private static Map<Character, Long> getFrequency(String s) {
        return  s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }

    private static Map<Character, Integer> getFrequencyByArray(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for(char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }
}
