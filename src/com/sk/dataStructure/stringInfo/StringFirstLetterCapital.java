package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class StringFirstLetterCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        String[] stArr = str.split(" ");
        for(String s : stArr) {
            StringBuilder stb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                stb.append(s);
//                String ss = new String();
                if(i == 0) {
                    stb.replace(0, 1, String.valueOf(Character.toUpperCase(ch)));
                    break;
                }
            }
            sb.append(stb).append(" ");
        }
        
        System.out.println(sb);
    }
}
