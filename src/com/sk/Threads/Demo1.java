package com.sk.Threads;

public class Demo1 extends Thread {
    @Override
    public void run() {
     System.out.println("Printing numbers Started");
       try {
           for (int i = 1; i <= 5; i++) {
               System.out.println(i);
               Thread.sleep(5000);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
     System.out.println("Printing numbers Done");
    }
}
