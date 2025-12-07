package com.sk.Threads;

import java.util.Scanner;

public class Demo3 extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Input task Started");
        System.out.println("Enter Uname");
        String un = sc.next();
        System.out.println("Enter Password");
        String up = sc.next();
        System.out.println("User Input task Ended");
        sc.close();
    }
}
