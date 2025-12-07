package com.sk.Reflection;

public class Student {
    String name;
    int age;
    int id;
    public Student(String name, int age, int id) {
        this(id, name);
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Student(int id, String name) {
        this(name);
        this.id = id;
        this.name = name;
    }
    public Student(String name) {
        this();
        this.name = name;
    }
    public Student() {
    
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public int getAge() {
        return age;
    }
    
    private void greeting(){
        System.out.println("Hello user " + getName());
    }
}
