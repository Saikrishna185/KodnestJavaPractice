package com.sk.serialization.ExternaliziableInterface;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
    
    int id;
    String name;
    int age;
    String gender;
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
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeUTF(name);
        out.write(marks);
    
    }
    
    @Override
    public void readExternal(ObjectInput in) throws IOException {
        this.id = in.readInt();
        this.name = in.readUTF();
        this.marks = in.readInt();
    }
}
