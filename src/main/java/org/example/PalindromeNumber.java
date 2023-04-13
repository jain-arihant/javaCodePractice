package org.example;

import java.util.Scanner;

    public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        palindromeInt(num);
    }
    private static void palindromeInt(int num){
            int rem =0, output =0;
            int temp = num;
            while(temp!= 0) {
                rem = temp % 10;
                temp = temp / 10;
                output = output * 10 + rem;
            }
        if (output == num){
            System.out.println("Number is palindrome: "+num);
            System.out.println("Output: "+output);
        }
        else
            System.out.println("Number is not palindrome: "+num);

    }
}
