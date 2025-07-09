package com.engineeringdigest.collectionframework.interview;

import java.util.Arrays;

public class AnagramCheck {


    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

}
