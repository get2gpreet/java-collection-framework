package com.engineeringdigest.collectionframework.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveCommonFromLists {


    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> collect = list2.stream().filter(list1::contains).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println(Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList()));

    }
}
