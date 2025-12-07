package com.sk.basicmath;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        
        // Convert decimal to binary
        String binary = "";
        int tempnum = decimal;
        while(tempnum > 0) {
            int rem = tempnum % 2;
            binary = rem + binary;
            tempnum/=2;
        }
        System.out.println("The binary equivalent of " + decimal + " is " + binary);
    }
}
