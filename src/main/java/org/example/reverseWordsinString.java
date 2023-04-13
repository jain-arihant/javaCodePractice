package org.example;

import java.util.Scanner;

public class reverseWordsinString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: "); //god is great
        String input = sc.nextLine();
        reverseString(input); //great is god
    }
    private static String reverseString(String input){
        String output="";
        String str[] = input.split(" ");
        for (int i = str.length - 1; i>=0; i--){
            output += str[i] + " ";
        }
        System.out.println(output);
        output = output.substring(0,output.length() -1);
        return output;
    }
}
