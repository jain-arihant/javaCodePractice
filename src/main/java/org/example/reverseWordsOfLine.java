package org.example;

import java.util.Scanner;

public class reverseWordsOfLine {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: "); //arihant is good
        String input = sc.nextLine();
        System.out.println("Output is: "+reverseLineWords(input)); //tnahira si doog
        System.out.println("Output is from StringBuilder: "+reverseLineWordsSb(input));
    }
    private static String reverseLineWords(String input){
        String output = "";
        String str1[] = input.split(" ");
        for(String w : str1){
            output += reverse(w) + " ";
        }
        output = output.substring(0, output.length() -1);
        return output;
    }
    private static String reverse(String str){
        String output= "";
        char str1[] = str.toCharArray();
        for (int i = str.length()-1; i>= 0; i-- ){
            output += str1[i];
        }
        return output;
    }

    private static String reverseLineWordsSb( String input){
        String str1[] = input.split(" ");
        String output = "";
        for (String w:str1){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            output += sb.toString()+ " ";
        }
        return output.trim();
    }
}

