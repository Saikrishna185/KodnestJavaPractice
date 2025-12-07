package com.sk.dataStructure.stringInfo.mutableString;

import java.util.Scanner;

public class Stringrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Ask user for input string
        String inputStr = sc.nextLine();
        // TODO: Ask user for the number of positions and direction
        int num = sc.nextInt();
        sc.nextLine();
        String direction = sc.nextLine();
        direction = direction.toLowerCase();
        // TODO: Rotate the string
        int len = inputStr.length();
        num = num % len;
        String store = "";
        switch (direction) {
            case "left" ->
                store = inputStr.substring(num) + inputStr.substring(0,num);
            case "right" ->
                store = inputStr.substring(len-num)+inputStr.substring(0,len-num);
        }
        System.out.println(store);
        // TODO: Print the rotated string
        sc.close();
    }
}
