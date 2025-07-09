package com.engineeringdigest.collectionframework.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SecondHighest {


    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        System.out.println(findSecondHighest(arr)); // Output: 4
    }

    private static Integer findSecondHighest(int[] arr) {
        Arrays.stream(arr);
        return Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }
}
