package com.sk.exceptionhandling;

import java.util.Scanner;

public class Applicant {
    int age;
    
    void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
    }
    
    void validateAge() throws UnderAgeException, OverAgeException {
        if(age < 21) {
           UnderAgeException uae = new UnderAgeException();
            System.out.println(uae.getMessage());
            throw uae;
        } else if (age >= 21 && age <= 40) {
            System.out.println("Congratulations! You are an applicant!......");
        } else if (age > 40) {
            OverAgeException oae = new OverAgeException();
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
    
}
