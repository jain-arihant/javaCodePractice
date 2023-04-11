package org.example;

import java.util.Scanner;

public class reverseString {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
    private static String reverse (String str){
        String output = "";
        int length = str.length();
        char[] str11 = str.toCharArray();
        for (int i = length -1; i>=0; i--){
            output += str11[i];
        }
        return output;
    }
}
