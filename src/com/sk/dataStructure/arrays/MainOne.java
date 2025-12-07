package com.sk.dataStructure.arrays;

import java.util.*;

public class MainOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextInt();
        }
        int[] result = dailyTemperatures(temperatures);
        for (int r : result) {
            System.out.print(r + " ");
        }
        scanner.close();
    }
    
    public static int[] dailyTemperatures(int[] temperatures) {
        // Implement the logic here
        int[] dailytemp = new int[temperatures.length];
        for(int i = 0; i < temperatures.length - 1; i++) {
            for(int j = i + 1; j < temperatures.length; j++) {
                if(temperatures[i] < temperatures[j]){
                    dailytemp[i] = j - i;
                    break;
                }
                else if(j == temperatures.length-1){
                    dailytemp[i] = 0;
                }
            }
        }
            return dailytemp;
    }
}
