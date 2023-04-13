package org.example;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: "); //arihant //naman
        String str = sc.nextLine();
        palindromeCheck(str);
    }

    private static void palindromeCheck(String str) {

        boolean result = false;
        int size = str.length();
        if (size == 0) {
            System.out.println("Null String");
        } else if (size == 1) {
            System.out.println("Palindrome : " + str);
        } else {
            char[] strArray = str.toLowerCase().toCharArray();
            for (int i = 0; i < size; i++) {
                if (strArray[i] != strArray[size - i - 1]) {
                    result = false;
                } else
                    result = true;
            }
            if(result){
                System.out.println("Palindrome : " + str); //naman
            }
            else
                System.out.println("Not Palindrome : " + str); //arihant
        }
    }
}
