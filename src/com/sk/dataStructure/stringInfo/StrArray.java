package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class StrArray {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
//        int n = sc.nextInt();
    }
}
