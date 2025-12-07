package com.sk.dataStructure.collection;

public class LinkedList {
    class Node {
        private int data;
        private Node link;
    }
    private Node first;
    
    public void insertNode(int value) {
        Node ref = new Node();
        ref.data = value;
        ref.link = null;
        if(first == null) {
              first = ref;
        }
        else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = ref;
        }
    }
    
    public void insertFront(int value) {
        Node ref = new Node();
        ref.data = value;
        ref.link = null;
        if(first == null) {
            first = ref;
        }
        else {
            ref.link = first;
            first = ref;
        }
    }
    
    public void deleteNode() {
        if(first == null) {
            System.out.println("Cannot Delete as the Linked List is Empty.");
        }
        else {
            Node temp = first;
            while (temp.link.link != null) {
                temp = temp.link;
            }
            System.out.println("Deleted Node is: " + temp.link.data);
            temp.link = null;
        }
    }
    
    public void deleteFirst() {
        if(first == null) {
            System.out.println("Cannot Delete as the Linked List is Empty.");
        }
        else {
            System.out.println("Deleted Node is: " + first.data);
            first = first.link;
        }
    }
    
    public void displayLL() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
