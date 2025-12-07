package com.sk.dataStructure.collection;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr = new Array(6);
        arr.insert(99,0);
        arr.display();
        arr.inserAll(50);
        arr.display();
        System.out.println(arr.search(29));
        arr.delete(3);
        arr.display();
    }
}
