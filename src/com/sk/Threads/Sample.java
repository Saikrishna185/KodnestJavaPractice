package com.sk.Threads;

import java.util.Scanner;

public class Sample implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("Print")){
            print();
        } else if(name.equals("Add")){
            addition();
        } else {
            userInput();
        }
    }
    
    public void print() {
        System.out.println("Printing numbers Started");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Printing numbers Done");
    }
    
    public void addition() {
        System.out.println("Addition task started");
        try {
            int a = 10;
            int b = 20;
            Thread.sleep(2000);
            int c = 80;
            System.out.println("After adding: " + (a + b + c));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Addition task finished");
    }
    
    public void userInput() {
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
