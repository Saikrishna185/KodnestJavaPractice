package com.sk.Pattern;

public class PencilPattern {
    public static void main(String[] args) {
        // Define the number of rows for the pencil pattern
        int n = 5;
        
        // Call method to print the pencil pattern
        printPencilPattern(n);
    }
    
    // Method to print the pencil pattern
    static void printPencilPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = n; j > i+1; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n*2)-1 ; j++) {
                if(j == 1 || j == (n*2)-1 || i == n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
