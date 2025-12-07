package com.sk.dataStructure.stringInfo.mutableString;

public class CheckCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sita");
        sb.append("Ram");
        System.out.println(sb);
        System.out.println();
        
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        sb1.append("Hello Good Morning!");
        System.out.println(sb1.capacity());
        System.out.println();
        
        StringBuffer sbu = new StringBuffer(100);
        System.out.println(sbu.capacity());
        System.out.println();
        
        StringBuilder strB = new StringBuilder();
        System.out.println(strB.capacity());
        strB.append("Nice To Meet You.");
        System.out.println(strB.capacity());
        System.out.println();
        
        StringBuilder strB1 = new StringBuilder(150);
        System.out.println(strB1.capacity());
        
        StringBuffer sbn = new StringBuffer("Hello");
        sbn.insert(1, "g");
        System.out.println(sbn);
        sbn.delete(1,2);
        System.out.println(sbn);
        sbn.reverse();
        System.out.println(sbn);
        System.out.println();
        
        
        StringBuilder sbl = new StringBuilder("GoodBye");
        sbl.insert(5, "i");
        System.out.println(sbl);
        sbl.delete(1,4);
        System.out.println(sbl);
        sbl.reverse();
        System.out.println(sbl);
    }
}
