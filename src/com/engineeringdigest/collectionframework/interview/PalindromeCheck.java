package com.engineeringdigest.collectionframework.interview;

public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // Output: true
    }

    private static boolean isPalindrome(String inputString) {
        return new StringBuilder(inputString).reverse().toString().equals(inputString);

//        int start = 0, end = inputString.length() - 1;
//        while(start < end) {
//            if(inputString.charAt(start) != inputString.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
    }
}
