package com.engineeringdigest.collectionframework.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctSortedTwoList {

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 2, 3};
        int[] arr2 = {2, 1, 6, 1, 2, 5};

        Stream.of(arr1, arr2);

        System.out.println(getDistinctSorted(arr1,arr2)); // Output: [1, 2, 3, 4]
    }

    private static List<Integer> getDistinctSorted(int[] arr1,int[] arr2) {
        return Stream.concat(
                        Arrays.stream(arr1).boxed(),
                        Arrays.stream(arr2).boxed()
                )
                .distinct()
                .collect(Collectors.toList());
    }
}
