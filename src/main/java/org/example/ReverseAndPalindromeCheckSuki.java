package org.example;

public class ReverseAndPalindromeCheckSuki {

//"Apple madam banana amma"
//1. Reverse the string
//2. If word is palindrome print yes
//3. If no, print word
        public static void main(String[] args) {
            String str = "Apple madam banana amma";
            System.out.println(reverse(str));
            Boolean result = false;
//        checkPalindrome(str);
            String[] words = str.split(" ");
            for (String word : words) {
                result = checkPalindrome(word);
                if(result){
                    System.out.println("Word is a palindrome: "+word);
                }
                else {
                    System.out.println("Word is not a palindrome: "+word);
                }
            }
        }
        public static String reverse(String str){
            int size = str.length();
            char[] str11 = str.toLowerCase().toCharArray();
            String output = "";
            if(size>0) {
                for (int i =size-1; i>= 0; i--){
                    output += str11[i];
                }
            }
            return output;
        }
        public static Boolean checkPalindrome(String str){
            Boolean result = false;
            String str1 = reverse(str);
            if(str.equals(str1)){
                result = true;
            }
            return result;
        }
    }



