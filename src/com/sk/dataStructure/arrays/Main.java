package com.sk.dataStructure.arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println(maxProduct(nums));
    }
    
    public static int maxProduct(int[] nums) {
        // Your logic here
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int subProduct = 1;
            for (int j = i; j < nums.length; j++) {
                subProduct *= nums[j];
                
                if(subProduct > maxNum) {
                    maxNum = subProduct;
                }
            }
        }
            return maxNum;
    }
}
