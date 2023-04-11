package org.example;

import java.util.Scanner;

public class reverseStringWithSpacesPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        reverseStringWithSpacesIntact(input);
    }
    private static String reverseStringWithSpacesIntact(String input){
        char str[] = input.toCharArray();
        char output[] = new char[input.length()];
        for (int i = 0; i< str.length; i++){
            if(str[i] == ' '){
                output[i] = ' ';
            }
        }
        int j = output.length -1;
        for(int i=0; i< str.length; i++ ){
            if (str[i] != ' '){
                if (output[i] == ' '){
                    j--;
                }
                else{
                output[i] = str[i];
                j--;
                }
            }
        }
        System.out.println("Output: "+String.valueOf(output));
        return String.valueOf(output);
    }
}
