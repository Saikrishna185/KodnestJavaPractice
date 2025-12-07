package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class ReverseStringWithSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == ' ') {
                continue;
            }
            sb.append(str.charAt(i));
        }
        
        for(int i = 0; i < sb.length(); i++) {
            if(str.charAt(i) == ' ') {
                sb.insert(i, ' ');
            }
        }
        System.out.println(sb);
    }
}
