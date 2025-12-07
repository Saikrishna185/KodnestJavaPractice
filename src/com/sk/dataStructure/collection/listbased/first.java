package com.sk.dataStructure.collection.listbased;

import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(50);
        System.out.println("Size--> " + al.size());
        al.add(100);
        System.out.println("Size--> " + al.size());
        al.add(150);
        al.add(96);
        al.add(852);
        System.out.println(al);
        al.add("Sx");
        al.add(3.1456f);
        al.add("Hello");
        al.add(true);
        al.add('X');
        System.out.println(al);
        al.add(3, 4);
        System.out.println(al);
        System.out.println(al.contains(4));
        System.out.println(al.get(2));
        System.out.println(al.indexOf(4));
        System.out.println(al.isEmpty());
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.remove(3));
        System.out.println(al);
        System.out.println("Size--> " + al.size());
        
//        ArrayList all = (ArrayList) al.clone();
        System.out.println(al.lastIndexOf("Hello"));
        al.clear();
        System.out.println(al.isEmpty());
//        System.out.println(all);
    }
}
