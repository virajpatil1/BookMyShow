package com.example.bookmyshow.exceptions;

public class InvalidUser extends Exception{

    public InvalidUser() {
    }

    public InvalidUser(String message) {
        super(message);
    }
}
