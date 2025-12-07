package com.sk.exceptionhandling;

public class Bank {
    public void initiate() {
        System.out.println("Connection to bank server established...");
        try {
            ATM atm = new ATM();
            atm.validate();
        } catch (Exception e) {
            System.out.println("Issue reached bank from ATM...");
        }
        System.out.println("Connection to bank server terminated...");
    }
}
