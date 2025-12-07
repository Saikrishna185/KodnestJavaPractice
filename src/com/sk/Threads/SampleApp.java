package com.sk.Threads;

public class SampleApp {
    public static void main(String[] args) {
        // Using Thread to create multiple Stack traces and Multiple Threads
        // Using multiple classes for multi-threading using Runnable class - Approach-1
//        Thread t1 = new Thread(new Sample1());
//        Thread t2 = new Thread(new Sample2());
//        Thread t3 = new Thread(new Sample3());
//
//        t1.start();
//        t2.start();
//        t3.start();
        
        // Using single classes for multi-threading using Runnable class - Approach-2
        Thread task1 = new Thread(new Sample());
        Thread task2 = new Thread(new Sample());
        Thread task3 = new Thread(new Sample());
        
        task1.setName("Print");
        task2.setName("Add");
        
        task1.start();
        task2.start();
        task3.start();
    }
}
