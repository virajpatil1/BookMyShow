package com.project.bookmyshow.exceptions;

public class EmailAlreadyExitsException extends RuntimeException{

    public EmailAlreadyExitsException() {
        super("Email is already Register.");
    }
}
