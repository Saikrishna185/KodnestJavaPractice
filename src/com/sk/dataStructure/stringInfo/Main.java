package com.sk.dataStructure.stringInfo;

public class Main {
    public static void main(String[] args) {
//        String s1 = new String("Rama");
//        String s2 = new String("Rama");
//
//        if(s1 == s2) {
//            System.out.println("String references are equal");
//        }
//        else {
//            System.out.println("String references are not equal");
//        }
//
//        if(s1.equals(s2)) {
//            System.out.println("String values are equal");
//        }
//        else {
//            System.out.println("String values are not equal");
//        }
        
        
        String s1 = "Rama";
        String s2 = "Sita";
        String s3 = "Rama" + "Sita";
        String s4 = "Rama" + "Sita";

        if(s3 == s4) {
            System.out.println("String references are equal");
        }
        else {
            System.out.println("String references are not equal");
        }

        if(s3.equals(s4)) {
            System.out.println("String values are equal");
        }
        else {
            System.out.println("String values are not equal");
        }
        
//        String s1 = "Rama";
//        String s2 = "Sita";
//        String s3 = s1 + s2;
//        String s4 = s1 + s2;
//
//        if(s3 == s4) {
//            System.out.println("String references are equal");
//        }
//        else {
//            System.out.println("String references are not equal");
//        }
//
//        if(s3.equals(s4)) {
//            System.out.println("String values are equal");
//        }
//        else {
//            System.out.println("String values are not equal");
//        }
    }
}
