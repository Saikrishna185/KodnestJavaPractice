package com.sk.serialization.ExternaliziableInterface;

import com.sk.serialization.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentApp {
    public static void main(String[] args) {
        try {
            com.sk.serialization.Student student = new Student(21, "Male", 420, 80, "Sekhar");
            System.out.println(student);
            String path = "C:\\Kodnest\\StudentOne.txt";
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
