package com.javaFramework.JDBC;

public class InvalidCredentialsException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid Credentials, Please try again";
    }
}
