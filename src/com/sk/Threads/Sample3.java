package com.sk.Threads;

import java.util.Scanner;

public class Sample3 implements Runnable {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Input task Started");
        System.out.println("Enter Uname");
        String un = sc.next();
        System.out.println("Enter Password");
        String up = sc.next();
        System.out.println("The entered user-name is: " + un + " and The entered password is: " + up);
        System.out.println("User Input task Ended");
        sc.close();
    }
}
