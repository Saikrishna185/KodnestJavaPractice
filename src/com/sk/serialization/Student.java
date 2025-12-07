package com.sk.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    /* transient keyword used to exclude the property for serialization. */
    transient int age;
    transient String gender;
    int marks;
    
    public Student(int age, String gender, int id, int marks, String name) {
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                '}';
    }
}
