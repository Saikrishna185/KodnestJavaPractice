package com.sk.Threads.PCProblem;

public class Consumer implements Runnable {
    Factory factory;
    public Consumer(Factory factory) {
        this.factory = factory;
    }
    @Override
    public void run() {
        while (true) {
            try {
                factory.getData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
