package com.sk.Pattern;

public class HollowDiamond {
   
        public static void main(String[] args) {
            // Use nested for loops to print the given pattern
            int n = 5;
            for(int i = 1; i <= n; i++) {
                for(int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++) {
                    if(i == 1 || j == 1 || j == i) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            for(int i = 1; i <= n-1; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for(int j = n-1; j >= i; j--) {
                    if(i == n-1 || j == n-1 || j == i) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
}
