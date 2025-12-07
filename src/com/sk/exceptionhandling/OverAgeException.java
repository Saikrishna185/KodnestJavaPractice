package com.sk.exceptionhandling;

public class OverAgeException extends Exception {
    String message = "You are over age to apply.";
    @Override
    public String getMessage() {
        return message;
    }
}
