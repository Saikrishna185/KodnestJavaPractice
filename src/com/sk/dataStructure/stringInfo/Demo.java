package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "Raghupati Raghav Raja Rama";
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        System.out.println(s.charAt(5));
//        System.out.println(s.indexOf("j"));
//        System.out.println(s.startsWith("Raghupati"));
//        System.out.println(s.endsWith("Rama"));
//        System.out.println(s.length());
//        System.out.println(s.substring(17));
//        System.out.println(s.substring(10,17));
//        char[] arr = s.toCharArray();
//        System.out.print("[");
//        for (char c:
//             arr) {
//            System.out.print(c + ", ");
//        }
//        System.out.println("]");
//        String str = new String();
//        str = str.concat("Hello World, Welcome to My World!");
//        System.out.println(str.replaceAll("o", "a"));
//        String str1 = new String();
//        System.out.println(str1.isEmpty());
//        str1 = str1.concat("Hello");
//        System.out.println(str1.isEmpty());
//
//        String str2 = "";
//        System.out.println(str2.isEmpty());
//        System.out.println(str2.isBlank());
//        str2 = str2.concat(" ");
//        System.out.println(str2.isEmpty());
//        System.out.println(str2.isBlank());
//
//        String str3 = "  Hello World!      ";
//        System.out.println("Before Trim: " + str3);
//        System.out.println("After Trim: " + str3.trim());
        
        String[] str23 = sc.nextLine().split(" ");
        System.out.print("[ ");
        for (String s3:
             str23) {
            System.out.print(s3 + " ");
        }
        System.out.println("]");
    }
}
