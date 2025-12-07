package com.sk.Threads.PCProblem;

public class Factory {
    int x;
    boolean isProduced = false;
    public void setData(int data) throws InterruptedException {
        if(isProduced) {
            wait();
        }
        x = data;
        System.out.println("Producer has produced data: " + x );
        isProduced = true;
        notify();
    }
    public void getData() throws InterruptedException {
        if(!isProduced) {
            wait();
        }
        System.out.println("Consumer has consumed data: " + x );
        isProduced = false;
        notify();
    }
}
