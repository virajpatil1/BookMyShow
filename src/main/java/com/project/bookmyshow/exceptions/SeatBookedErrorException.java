package com.project.bookmyshow.exceptions;

public class SeatBookedErrorException extends RuntimeException{

    public SeatBookedErrorException(Integer rowNo, Integer colNo) {
    super("This row and col is already booked :+"+rowNo+" ,"+colNo);
    }
}
