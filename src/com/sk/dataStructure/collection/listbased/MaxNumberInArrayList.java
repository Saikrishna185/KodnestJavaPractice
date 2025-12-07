package com.sk.dataStructure.collection.listbased;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNumberInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
//            int num = list.get(i);
//            if(max < num) {
//                max = num;
//            }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum is : " + max);
    }
}
