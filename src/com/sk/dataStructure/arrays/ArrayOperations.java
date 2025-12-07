package com.sk.dataStructure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();
        
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();
        
        System.out.println("Enter the Key value to search: ");
        int key = sc.nextInt();
        System.out.println("The search result is: " + Arrays.binarySearch(arr, key));
        
        System.out.println("Enter the value to fill the array: ");
        int val = sc.nextInt();
        Arrays.fill(arr, val);
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();
    }
}
