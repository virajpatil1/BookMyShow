package com.project.bookmyshow.exceptions;

public class IllegalEmailException extends RuntimeException{

    public IllegalEmailException() {
        super("Email is not valid.");
    }
}
