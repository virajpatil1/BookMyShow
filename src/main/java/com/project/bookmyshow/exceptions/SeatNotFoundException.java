package com.project.bookmyshow.exceptions;

public class SeatNotFoundException extends RuntimeException{

    public SeatNotFoundException(Integer colNo ,Integer rowNo) {
        super("Seat not found :Col no: "+colNo+" Row no: "+rowNo);
    }
}
