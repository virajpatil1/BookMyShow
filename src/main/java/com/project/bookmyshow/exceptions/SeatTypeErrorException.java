package com.project.bookmyshow.exceptions;

import com.project.bookmyshow.enums.SeatType;

public class SeatTypeErrorException extends RuntimeException{

    public SeatTypeErrorException(SeatType seatType) {
        super("This seat-type "+seatType+"+is not available pls check for available.");
    }
}
