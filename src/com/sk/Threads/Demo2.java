package com.sk.Threads;

public class Demo2 extends Thread {
    @Override
    public void run() {
        System.out.println("Addition task started");
        try {
            int a = 10;
            int b = 20;
            Thread.sleep(3000);
            int c = 80;
            System.out.println(a + b);
        } catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println("Addition task finished");
    }
}
