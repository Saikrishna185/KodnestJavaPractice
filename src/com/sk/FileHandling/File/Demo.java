package com.sk.FileHandling.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String str = br.readLine();
        int a = br.read();
        
        System.out.println(str);
        
        
//        String path = "C:\\Kodnest\\studentpercentage.txt";
//        File file = new File(path);
//        System.out.println("path: "  + file.getPath());
//        System.out.println("Absolute path: "  + file.getAbsolutePath());
//        System.out.println("Canonical path: " + file.getCanonicalPath());
//        System.out.println("Name: " +  file.getName());
//        System.out.println("Does the file exist? " + file.exists());
//        System.out.println("Is the file path? " + file.isFile());
//        System.out.println("Is the folder path? " + file.isDirectory());
//        System.out.println("Does the file has read permission? " + file.canRead());
//        System.out.println("Does the file has write permission? " + file.canWrite());
//        System.out.println("Does the file has execute permission? " + file.canExecute());
//        System.out.println("File size: "  + file.length());
//        System.out.println("Last modified: "  + file.lastModified());
//        System.out.println("IS the file hidden: " + file.isHidden());
//        System.out.println("Parent of the file: " + file.getParent());
//        System.out.println("Class of the file: " + file.getClass());
        
    }
}
