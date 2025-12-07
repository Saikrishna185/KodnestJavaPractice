package com.sk.Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = n-1; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i*2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = (n*2)-i; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
