package com.sk.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentApp {
    public static void main(String[] args) {
        try {
            Student student = new Student(21, "Male", 420, 80, "Sekhar");
            System.out.println(student);
            String path = "C:\\Kodnest\\Student.txt";
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
