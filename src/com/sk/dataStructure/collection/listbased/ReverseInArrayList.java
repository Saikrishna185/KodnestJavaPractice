package com.sk.dataStructure.collection.listbased;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseInArrayList {
    public static ArrayList<Integer> swap(ArrayList<Integer> al) {
        int start = 0;
        int end = al.size()-1;
        while(start < end) {
            int a = al.get(start);
            int b = al.get(end);
//            a = a + b;
//            b = a - b;
//            a = a - b;
            
            al.set(start, b);
            al.set(end, a);
            
            start++;
            end--;
        }
        return al;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Before Swap: " + list);
        swap(list);
        System.out.println("After Swap: " + list);
    }
}
