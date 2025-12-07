package com.sk.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeApp {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Shivam", 21, 6000);
        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        String path =  "C:\\Kodnest\\Employee.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
    }
}
