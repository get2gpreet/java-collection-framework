package com.engineeringdigest.collectionframework.interview;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        String input = "aaabbcdddde";
        String output = removeConsecutiveDuplicates(input);
        System.out.println(output);  // Output: "abcde"
    }

    private static String removeConsecutiveDuplicates(String input) {
       StringBuilder result = new StringBuilder();
       char prevChar = input.charAt(0);
       result.append(prevChar);

       for (int i = 1; i < input.length(); i++){
           char currChar = input.charAt(i);
           if(prevChar != currChar){
               result.append(currChar);
               prevChar = currChar;
           }
       }
       return result.toString();
    }
}
