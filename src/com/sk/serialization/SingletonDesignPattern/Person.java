package com.sk.serialization.SingletonDesignPattern;

import java.io.Serializable;

public class Person implements Serializable {
    private static Person person;
    
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int mobileNo;
    
    private Person(String firstName, String lastName, int age, String email, int mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.mobileNo = mobileNo;
    }
    
    public static Person getInstance(String firstName, String lastName, int age, String email, int mobileNo) {
        if(person == null) {
            person = new Person(firstName, lastName, age, email, mobileNo);
        }
        return person;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }
    
}
