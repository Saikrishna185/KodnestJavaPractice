package com.sk.Threads;

public class Sample1 implements Runnable {
    
    @Override
    public void run() {
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
}
