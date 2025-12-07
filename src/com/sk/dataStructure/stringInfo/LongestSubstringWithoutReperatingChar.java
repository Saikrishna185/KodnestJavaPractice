package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class LongestSubstringWithoutReperatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        String str = sc.nextLine();
        int storage = 0;
        for(int i = 0; i < str.length()-1; i++) {
            int count = 1;
            for(int j = i + 1; j < str.length()-2; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    break;
                }
                count++;
            }
            if (count > storage) {
                storage = count;
            }
        }
        System.out.println("Length of Longest Substring Without Repeating Characters: " + storage);
        
//        String str = sc.nextLine();
//        StringBuilder sb = new StringBuilder();
//        int maxNum = 1;
//        for(int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(sb.indexOf(String.valueOf(ch)) != -1) {
//                continue;
//            }
//            for(int j = 0; j < str.length(); j++) {
//                if(str.charAt(i) == str.charAt(j)){
//                    continue;
//                }
//                else {
//                    sb.append(ch);
//                }
//            }
//            maxNum = Math.max(maxNum, sb.length());
//        }
//        System.out.println(sb);
//        System.out.println(maxNum);
    }
}
