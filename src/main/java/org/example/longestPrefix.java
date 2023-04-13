package org.example;

import java.util.Arrays;

public class longestPrefix {
    public static void main (String[] args){
        String[] arr = {"flower", "flauna","float"};
        System.out.println("Longest Prefix: "+longestPrefixInArray(arr));
    }
    private static String longestPrefixInArray(String[] input){
        int size = input.length;
        if(size == 0){
            return "";
        }
        if (size == 1){
            return input[0];
        }
        /* sort the array of strings */
        Arrays.sort(input);
        /* find the minimum length from first and last string */
        int end = Math.min(input[0].length(), input[size-1].length());
        int i =0;
        while(i<end && input[0].charAt(i)==input[size-1].charAt(i))
            i++;
        String prefix = input[0].substring(0,i);
        return prefix;
    }
}
