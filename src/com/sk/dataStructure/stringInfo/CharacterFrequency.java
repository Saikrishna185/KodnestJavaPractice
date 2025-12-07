package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            // If the character is already checked, skip it
            if(sb.indexOf(String.valueOf(current)) != -1) {
                continue;
            }
            int count = 0;
            // Count frequency of current character
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == current) {
                    count++;
                }
            }
            sb.append(current);
            System.out.println(current + ": " + count);
        }
    }
}