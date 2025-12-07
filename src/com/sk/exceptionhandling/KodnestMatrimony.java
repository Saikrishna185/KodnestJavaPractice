package com.sk.exceptionhandling;

public class KodnestMatrimony {
    void initiate() {
        Applicant app = new Applicant();
        try {
            app.takeInput();
            app.validateAge();
        } catch (Exception e) {
            System.out.println("Invalid input");
            e.printStackTrace();
        }
    }
}
