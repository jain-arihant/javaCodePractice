package org.example;

import java.util.HashMap;

public class charOccuranceInString {
    public static void main(String[] args){
        String str = "arihant";
        charCount(str);
    }
    private static void charCount(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
