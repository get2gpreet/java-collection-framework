package com.engineeringdigest.collectionframework.interview;

import java.util.Arrays;
import java.util.List;

public class SumEvenInList {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(sumOfEven(nums)); // 12
    }

    private static Integer sumOfEven(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
    }
}
