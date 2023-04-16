package org.example;

public class longestSubstring {
    public String longestCommonPrefix(String[] S) {
        if (S == null || S.length == 0) return "";
//        Arrays.sort(S);
        for (int i = 0; i < S[0].length() ; i++){
            char c = S[0].charAt(i);
            for (int j = 1; j < S.length; j ++) {
                if (i == S[j].length() || S[j].charAt(i) != c)
                    return S[0].substring(0, i);
            }
        }
        return S[0];
    }
    public static void main(String args[]) {
        // Your code goes here
        longestSubstring ob = new longestSubstring();
        String s[] = {"flower", "flow", "flight"};
        System.out.println(ob.longestCommonPrefix(s));
    }
}
//public class GFG
//{
//    public String longestCommonPrefix(String[] a)
//    {
//        int size = a.length;
//        /* if size is 0, return empty string */
//        if (size == 0)
//            return "";
//        if (size == 1)
//            return a[0];
//        /* sort the array of strings */
//        Arrays.sort(a);
//        /* find the minimum length from first and last string */
//        int end = Math.min(a[0].length(), a[size-1].length());
//
//        /* find the common prefix between the first and
//           last string */
//        int i = 0;
//        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
//            i++;
//
//        String pre = a[0].substring(0, i);
//        return pre;
//    }
//
//    /* Driver Function to test other function */
//    public static void main(String[] args)
//    {
//        GFG gfg = new GFG();
//        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
//        System.out.println( "The longest Common Prefix is : " +
//                gfg.longestCommonPrefix(input));
//    }
//}
