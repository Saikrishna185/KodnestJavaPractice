package com.sk.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDesrialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path =  "C:\\Kodnest\\Employee.txt";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee employee = (Employee) ois.readObject();
        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
    }
}
