package com.sk.exceptionhandling;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("Main connection established...");
        Bank bank = new Bank();
        bank.initiate();
        System.out.println("Main connection Terminated...");
    }
}
