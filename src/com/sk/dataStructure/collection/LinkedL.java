package com.sk.dataStructure.collection;

public class LinkedL{
    private class Node{
        private int data;
        private Node link;
    }
    Node first;
    
    public void insert(int value) {
        Node ref = new Node();
        ref.data = value;
        ref.link = null;
        
        if(first == null) {
            first = ref;
        }
        else {
             Node temp = first;
             while(temp.link != null) {
                 temp = temp.link;
             }
             temp.link = ref;
        }
        
    }
    public void insertFront(int value) {
        Node ref = new Node();
        ref.data = value;
        ref.link = null;
        if(first == null){
            first = ref;
        }
        else {
            ref.link = first;
            first = ref;
            
        }
    }
}
