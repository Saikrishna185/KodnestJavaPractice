package com.sk.dataStructure.stringInfo;

import java.util.Scanner;
import java.util.Hashtable;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
        
        String ros = str.substring(0,0);
        System.out.println(ros + "hi");
    }
}
