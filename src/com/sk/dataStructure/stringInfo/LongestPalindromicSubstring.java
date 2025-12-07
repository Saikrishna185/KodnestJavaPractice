package com.sk.dataStructure.stringInfo;

    import java.util.Scanner;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the input string from user
        String input = sc.nextLine().trim();
        // TODO: Find the longest palindromic substring
        StringBuilder longestSubstring = new StringBuilder(longestPalindromicString(input));
        // TODO: Print the longest palindromic substring
        System.out.println(longestSubstring);
        sc.close();
    }
    
    public static String longestPalindromicString(String s) {
        if (s.length()  <= 1) {
            return s;
        } else {
            int maxLength = 0;
            for(int i = 0; i < s.length(); i++) {
                StringBuilder sb = new StringBuilder();
                for(int j = i + 1; j < s.length(); j++) {
                    sb.append(s.substring(i , j));
                    StringBuilder str = new StringBuilder(sb);
                    if(sb.reverse() == str) {
                    
                    }
                }
            }
        }
        return "";
    }
}
