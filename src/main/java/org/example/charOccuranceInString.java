package org.example;

import java.util.HashMap;

public class charOccuranceInString {
    public static void main(String[] args){
        String str = "arihant";
        charCount(str);
    }
    private static void charCount(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        int count =0;
        char ans = 0;
        System.out.println(map);
        for (int j =0; j< map.size(); j++)
        {char c = str.charAt(j);
        if(count<map.get(c)) {
            count = map.get(c);
            ans = c;
        }
       }
        System.out.println("Character: "+ans+" count: "+count);
    }
}
