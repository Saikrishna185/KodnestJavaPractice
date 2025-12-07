package com.sk.dataStructure.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer[]> list = new ArrayList<>();
        al.add(12);
        al.add(21);
        al.add(8);
        al.add(31);
        al.add(13);
        al.add(11);
        al.add(36);
        
        System.out.println(al);
        
        System.out.print("[");
        for (int i = 0; i <= al.size()-1; i++) {
            System.out.print(al.get(i));
            if(i != al.size()-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        int count = 0;
        System.out.print("[");
        for (Object x : al) {
            System.out.print(x);
            if(count != al.size()-1) {
                System.out.print(", ");
            }
            count++;
        }
        System.out.println("]");
        
        Iterator itr = al.iterator();
        count = 0;
        System.out.print("[");
        while (itr.hasNext()){
            System.out.print(itr.next());
            if(count != al.size()-1) {
                System.out.print(", ");
            }
            count++;
        }
        System.out.println("]");
    }
}
