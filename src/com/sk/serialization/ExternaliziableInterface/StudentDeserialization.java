package com.sk.serialization.ExternaliziableInterface;

import com.sk.serialization.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeserialization {
    public static void main(String[] args) {
        try {
            String path = "C:\\Kodnest\\StudentOne.txt";
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            com.sk.serialization.Student student = (Student) ois.readObject();
            System.out.println(student);
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}