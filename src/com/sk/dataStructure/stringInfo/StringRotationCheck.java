package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class StringRotationCheck {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // TODO: Ask user for input strings
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            // TODO: Check if the second string is a rotation of the first
            StringBuilder sb = new StringBuilder();
            String[] stArr1 = str1.split(String.valueOf(str2.charAt(0)));
//            String[] stArr2 = str1.split(String.valueOf(str1.charAt(0)));
            for (String stt:
                 stArr1) {
            System.out.println(stt);
            }
            // TODO: Print result
            if(stArr1[1].charAt(0) == str2.charAt(1)){
                System.out.println("The String '" + str1 + "' is a rotation of '" + str2 + "'.");
            }else {
                System.out.println("The String '" + str1 + "' is not a rotation of '" + str2 + "'.");
            }
            scanner.close();
        }
}
