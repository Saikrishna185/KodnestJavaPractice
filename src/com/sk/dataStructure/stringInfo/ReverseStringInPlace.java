package com.sk.dataStructure.stringInfo;

import java.util.Scanner;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb = new StringBuilder();

//        for(int i = 0; i < strArr.length; i++) {
//            for(int j = strArr[i].length()-1; j >= 0; j--) {
//                sb.append(strArr[i].charAt(j));
//            }
//            sb1.append(sb);
//            sb.delete(0,sb.length());
//        }
        
        for(String i : strArr) {
            StringBuilder sb = new StringBuilder();
            for(int j = i.length()-1; j >= 0; j--) {
                sb.append(i.charAt(j));
            }
            sb1.append(sb + " ");
//            sb.delete(0,sb.length());
        }
//        for(int i = 0; i < sb1.length(); i++) {
//            if(str.charAt(i) == ' ') {
//                sb1.insert(i, ' ');
//            }
//        }
        System.out.println(sb1);
    }
}
