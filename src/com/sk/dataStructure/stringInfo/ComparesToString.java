package com.sk.dataStructure.stringInfo;

public class ComparesToString {
    public static void main(String[] args) {
        String s1 = "Kodnest";
        String s2 = "Kodnest";
        String s3 = "KodNest";
        String s4 = "Governments";
        
        
        if(s1 == s2) {
            System.out.println("References of s1 ="+s1+"and s2="+s2+" Are Equal.");
        }
        else {
            System.out.println("References of s1 ="+s1+"and s2="+s2+" Are Not Equal.");
        }
        
        if(s1.equals(s3)) {
            System.out.println("Values of s1 ="+s1+"and s3="+s3+" Are Equal.");
        }
        else {
            System.out.println("Values of s1 ="+s1+"and s3="+s3+" Are Not Equal.");
        }
        
        if(s1.equalsIgnoreCase(s3)) {
            System.out.println("String values of s1 ="+s1+"and s3="+s3+" Are Equal by Ignoring Case.");
        }
        else {
            System.out.println("String values of s1 ="+s1+"and s3="+s3+" Are Not Equal by Ignoring Case.");
        }
        
        int res = s1.compareTo(s4);
        System.out.println("Res value "+res);
        if(res > 0) {
            System.out.println("String values of s1 ="+s1+" Is Greater s4="+s4);
        } else if (res < 0) {
            System.out.println("String values of s4 ="+s4+" Is Greater s1="+s1);
        } else {
            System.out.println("String values of s1 ="+s1+" Is Equal to s4="+s4);
        }
        
        String str = "Mango";
        String str1 = "Man";
        int resOne = str.compareTo(str1);
        System.out.println(resOne);
    }
}
