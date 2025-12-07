package com.sk.Threads;

public class Sample2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Addition task started");
        try {
            int a = 10;
            int b = 20;
            Thread.sleep(2000);
            int c = 80;
            System.out.println("Addition result: " + (a + b + c));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Addition task finished");
    }
}
