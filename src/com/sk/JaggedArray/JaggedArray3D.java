package com.sk.JaggedArray;

import java.util.Scanner;

public class JaggedArray3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Depth: ");
        int m = sc.nextInt();
        // 3D array Declaration
        int[][][] arr = new int[m][][];
        
        // 2D array Declaration
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of Rows for Depth " + i);
            int n = sc.nextInt();
            arr[i] = new int[n][];
        }
        
        // 1D array Declaration
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the number columns for Rows " + j + " with Depth " + i);
                int n = sc.nextInt();
                arr[i][j] = new int[n];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the elements for column: " + k + " whose row is " + j + " and depth is " + i);
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print("{ ");
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print("[ ");
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                    if(k != arr[i][j].length-1) {
                        System.out.print(",");
                    }
                }
                System.out.print(" ]");
                if(j != arr[i].length-1) {
                    System.out.print(",");
                }
            }
            System.out.print(" }");
            if(i != arr.length-1) {
                System.out.println(",");
            }
        }
    }
}
