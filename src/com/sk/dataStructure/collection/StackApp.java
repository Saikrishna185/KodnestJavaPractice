package com.sk.dataStructure.collection;

import java.util.Scanner;

public class StackApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks stk = new Stacks(5);
        System.out.println("Is Stack empty: " + stk.isEmpty());
        stk.push(10);
        stk.push(100);
        stk.push(1000);
        stk.push(10000);
        stk.push(100000);
        stk.push(1000000);
        stk.display();
        stk.pop();
        stk.display();
        stk.pop();
        stk.pop();
        stk.pop();
        System.out.println("Is Stack empty: " + stk.isEmpty());
        stk.pop();
        stk.display();
        System.out.println("Is Stack empty: " + stk.isEmpty());
    }
}
