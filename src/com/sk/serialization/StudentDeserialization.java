package com.sk.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeserialization {
    public static void main(String[] args) {
        try {
            String path = "C:\\Kodnest\\Student.txt";
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
            System.out.println(student);
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
