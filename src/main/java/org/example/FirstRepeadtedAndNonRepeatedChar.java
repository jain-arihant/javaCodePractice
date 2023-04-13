package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeadtedAndNonRepeatedChar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: "); //arihant
        String input = sc.nextLine();
        repeatedNonRepeatedChar(input);
    }
    private static void repeatedNonRepeatedChar(String str){
        char[] strArray = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: strArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }

        for (char c: strArray){
            if(map.get(c)==1){
                System.out.println("First non repeating element is : "+c); //r
                break;
            }
        }
        for (char c: strArray){
            if(map.get(c)>1){
                System.out.println("First repeating element is : "+c); //a
                break;
            }
        }
    }
}
