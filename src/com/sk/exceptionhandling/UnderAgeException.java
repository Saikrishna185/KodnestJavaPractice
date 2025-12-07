package com.sk.exceptionhandling;

public class UnderAgeException extends Exception {
    String message = "You are under age to apply.";
    @Override
    public String getMessage() {
        return message;
    }
}
