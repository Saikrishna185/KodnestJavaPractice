package com.sk.Threads.PCProblem;

public class Producer implements Runnable {
    Factory factory;
    public Producer(Factory factory) {
        this.factory = factory;
    }
    @Override
    public void run() {
        int a = 0;
        while (true) {
            try{
                factory.setData(++a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
