package com.sk.Annotations;

public class Sample {
    int age;
    void validateAge(int age) {
        @Validate(name = "Age Validation" , max = 65,  min = 20)
        int notAge = 10;
        System.out.println("Age is " + age);
    }
    
    public static void main(String[] args) {
        
        @Validate
        int age = 20;
        Sample sample = new Sample();
        sample.validateAge(age);
    }
}
