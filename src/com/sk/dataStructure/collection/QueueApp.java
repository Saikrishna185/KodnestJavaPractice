package com.sk.dataStructure.collection;

import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Queues queues = new Queues(5);
        queues.insert(10);
        queues.insert(20);
        queues.insert(30);
        queues.insert(40);
        queues.insert(50);
        queues.insert(10);
        queues.display();
        queues.delete();
        queues.display();
        queues.delete();
        queues.delete();
        queues.delete();
        queues.delete();
        queues.display();
    }
}
