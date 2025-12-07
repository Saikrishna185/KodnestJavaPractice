package com.sk.dataStructure.collection.listbased;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListImp {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(100);
        ll.add(990);
        ll.add("Sagar");
        ll.add(4165.11231);
        System.out.println(ll);
        ll.addFirst(9);
        System.out.println(ll);
        ll.add(4,999);
        System.out.println(ll);
        
        ArrayList al = new ArrayList();
        al.add(8);
        al.add(88);
        al.add(888);
        System.out.println("Al--> " + al);
        System.out.println("Ll--> " + ll);
        ll.addAll(al);
        System.out.println("Ll--> " + ll);
        ll.addAll(0, al);
        System.out.println("ll--> " + ll);
        System.out.println(al.containsAll(ll));
        System.out.println(ll.containsAll(al));
        
        LinkedList stack = new LinkedList();
        stack.push(12);
        stack.push(15);
        stack.push(77);
        stack.push(89);
        System.out.println("Ll as Stack--> " + stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        LinkedList queue = new LinkedList();
        queue.add(9);
        queue.add(99);
        queue.add(999);
        queue.add(9999);
        System.out.println("Ll as Queue--> " + queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
