package com.sk.JaggedArray;

import java.util.Scanner;

public class JaggedArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int m = sc.nextInt();
        int[][] arr = new int[m][];
        
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.println("Enter the Number of Columns for Row : " + i);
            arr[i] = new int[sc.nextInt()];
        }
//        arr[0] = new int[sc.nextInt()];
        
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//        arr[2] = new int[2];
        
        for(int i = 0; i <= arr.length-1; i++) {
            for(int j = 0; j <= arr[i].length-1; j++) {
                System.out.println("Enter the Elements for row " + i + " and columns " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("This is my 2D Jagged Array");
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.print("[ ");
            for(int j = 0; j <= arr[i].length-1; j++) {
                System.out.print(arr[i][j]);
                if(j != arr[i].length-1) {
                    System.out.print(",");
                }
            }
            System.out.print(" ]");
            if(i != arr.length-1) {
                System.out.println(",");
            }
        }
    }
}
