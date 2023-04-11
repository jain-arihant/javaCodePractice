package org.example;

import java.util.Scanner;

public class reverseStringKeepingVowelsConstant {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        reverseStringWithVowels(str);
    }
    private static String reverseStringWithVowels(String str){
        char[] input = str.toCharArray();
        String notVowel="";
        int j =0, i=0;
        for ( i =0; i< input.length; i++){
            if(isNotVowel(input[i])) {
                notVowel += input[i];
                j++;
            }
            for ( i =0; i< input.length; i++){
                if(isNotVowel(input[i])){
                    input[i] += notVowel.charAt(j--);
                }
            }
        }
        System.out.println("Output: "+String.valueOf(input));
        return String.valueOf(input);
    }

    private static boolean isNotVowel(char c) {
        return (c!='a' || c!='A' ||c!='e' || c!='E'|| c!='i' || c!='I'|| c!='o' || c!='O'|| c!='u' || c!='U');
    }
}
