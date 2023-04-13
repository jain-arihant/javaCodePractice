package org.example;

import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: "); //java
        String str = sc.nextLine();
        printSubstring(str);
    }
    private static void printSubstring(String str){
        int size = str.length();
        for(int i =0; i<size; i++){
            for (int j = i+1; j<size;j++){
                System.out.println(str.substring(i,j)); //j ja jav a av v
            }
        }
    }
}
