package com.engineeringdigest.collectionframework.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmallestMissingPositive {

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findSmallestMissingPositive(arr)); // Output: 2
    }

    private static int findSmallestMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(num > 0){
                set.add(num);
            }
        }
        int smallest = 1;
        while (set.contains(smallest)){
            smallest++;
        }
        return smallest;
    }
}
