package com.sk.exceptionhandling;

import java.util.Scanner;

public class ATM {
    int userID;
    int passwd;
    
    public void validate() throws Exception{
        System.out.println("Connection to db connected...");
        try{
            Scanner sc = new Scanner(System.in);
            userID = sc.nextInt();
            passwd = sc.nextInt();
            int result = userID / passwd;
            System.out.println("Validated take money..");
        }
        catch (ArithmeticException e) {
            System.out.println("Issue arise in ATM and solved in ATM ... money cannot be dispatched");
            throw e;
        }
        finally {
            System.out.println("Connection to db terminated...");
        }
    }
}
