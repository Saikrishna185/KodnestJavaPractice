package com.sk.dataStructure.collection.listbased;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapTwoNumberInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("Enter the first index: ");
        int index1 = sc.nextInt();
        System.out.println("Enter the second index: ");
        int index2 = sc.nextInt();
        
        if((index1 > 0 && index1 < list.size()) && (index2 > 0 && index2 < list.size())) {
            int a = list.get(index1);
            int b = list.get(index2);
            list.set(index1, b);
            list.set(index2, a);
        }
        System.out.println(list);
    }
}
