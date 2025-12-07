package com.sk.Threads.DeadLock;

public class Warrior extends Thread{
    final String resource1 = "Sarpastra";
    final String resource2 = "Garudastra";
    final String resource3 = "Bramhastra";
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Karna")) {
            karnaAcquiredResource();
        } else {
            arjunaAcquiredResource();
        }
    }
    
    public void karnaAcquiredResource() {
        try {
            Thread.sleep(5000);
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " has acquired " +  resource1);
                Thread.sleep(5000);
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " has acquired " +  resource2);
                    Thread.sleep(5000);
                    synchronized (resource3) {
                        System.out.println(Thread.currentThread().getName() + " has acquired " +  resource3);
                        Thread.sleep(5000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void arjunaAcquiredResource() {
        try {
            Thread.sleep(5000);
            synchronized (resource3) {
                System.out.println(Thread.currentThread().getName() + " has acquired " +  resource3);
                Thread.sleep(5000);
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " has acquired " +  resource2);
                    Thread.sleep(5000);
                    synchronized (resource1) {
                        System.out.println(Thread.currentThread().getName() + " has acquired " +  resource1);
                        Thread.sleep(5000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
