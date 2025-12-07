package com.sk.serialization.SingletonDesignPattern;

import java.io.FileInputStream;

public class PersonApp {
    public static void main(String[] args) {
        Person person = Person.getInstance("Sai Krishna", "Sahu", 22, "sksahu21@gmail.com", 787945651);
        System.out.println(person);
        String path = ":C\\Kodnest\\Person.txt";
        try {
            FileInputStream fis = new FileInputStream(path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
