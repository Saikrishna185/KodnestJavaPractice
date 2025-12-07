package com.sk.dataStructure.collection;

public final class Array {
    private int[] arr;
    private int size;
    public Array(int size) {
        this.size = size;
        arr = new int[size];
    }
    
    public void insert(int value, int index) {
        if(index >= 0 && index <= arr.length-1){
            arr[index] = value;
        }
        else {
            System.out.println("Your array length is out of bounds, after " + (arr.length-1) + " is last index.");
        }
    }
    
    public void inserAll(int value) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
    
    public void display() {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
            if(i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public boolean search(int key) {
        for(int i : arr) {
            if(i == key)
                return true;
        }
        return false;
    }
    
    public void delete(int index) {
        if(index >= 0 && index <= arr.length-1){
            arr[index] = 0;
        }
        else {
            System.out.println("Your array length is out of bounds, after " + (arr.length-1) + " is last index.");
        }
    }
    
}
