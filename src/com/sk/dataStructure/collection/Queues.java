package com.sk.dataStructure.collection;

public class Queues {
    private final int[] arr;
    private final int size;
    
    private int rear = -1;
    private int front = -1;
    private boolean isFull = false;
    private boolean isEmpty = false;
    public Queues(int size) {
        this.size = size;
        arr = new int[size];
    }
    
    public void insert(int value) {
        if(rear != size-1) {
            rear++;
            arr[rear] = value;
        } else {
            System.out.println("Queue is full");
            isFull = true;
        }
    }
    
    public void delete() {
        if(front == rear || front == size-1) {
            System.out.println("Queue is empty");
            isEmpty = true;
        } else {
            front++;
            System.out.println("The element deleted is: " + arr[front]);
            arr[front] = 0;
        }
    }
    
    public void display() {
        if(front == rear || front == size-1) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("[");
            for(int i = front + 1; i <= rear; i++) {
                System.out.print(arr[i]);
                if(i != rear) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    
    
}
