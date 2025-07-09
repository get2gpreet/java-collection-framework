package com.engineeringdigest.collectionframework.interview;

import java.util.*;
import java.util.stream.Collectors;

public class MapTest {

    private static Map<Integer,String> sortMapByValue(Map<Integer,String> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(107,"aaaa");
        map.put(102,"dddd");
        map.put(103,"cccc");
        map.put(108,"hhh");
        map.put(104,"bbbb");
        map.put(105,"eeee");
        map.put(101,"gggg");
        map.put(106,"fff");

        //System.out.println(sortMapByValue(map));

        List<Student> students = new ArrayList<>();
        students.add(new Student(101,"aaa", 85.0));
        students.add(new Student(102,"bbb", 60));
        students.add(new Student(103,"ccc", 85.0));
        students.add(new Student(104,"ddd", 90));
        students.add(new Student(105,"eee", 70));
        students.add(new Student(106,"fff", 80));

        Student student1 = students.stream()
                .max(Comparator.comparingDouble(Student::getGrade))
                .orElse(null);

        System.out.println(student1);

        double avarageGrade = students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);

        List<String> list = students.stream()
                .filter(student -> student.getGrade() < avarageGrade)
                .map(Student::getName).toList();


        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        List<Integer> reversedList = intList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


    }


}
