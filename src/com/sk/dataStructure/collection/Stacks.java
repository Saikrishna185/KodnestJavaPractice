package com.sk.dataStructure.collection;

public final class Stacks {
    private final int[] arr;
    private final int size;
    int top = -1;
    public Stacks(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int value) {
        if(top != size-1) {
            top++;
            arr[top] = value;
        }
        else {
            System.out.println("Stack OverFlow");
        }
    }
    
    public void pop() {
        if (top >= 0) {
            arr[top] = 0;
            top--;
        }
        else {
            System.out.println("Stack is Empty");
        }
    }
    public boolean isEmpty() {
        if(top >= 0 && top <= arr.length-1){
            return false;
        }
        return true;
    }
    
    public void display() {
        if (top >= 0) {
            System.out.print("[");
            for(int i = size-1; i >= 0; i--) {
                System.out.print(arr[i]);
                if(i != 0)
                    System.out.print(", ");
            }
            System.out.println("]");
        } else {
            System.out.println("Stack is Empty");
        }
        
    }
}
