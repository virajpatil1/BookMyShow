package com.project.bookmyshow.dtos;

import com.project.bookmyshow.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateSeatDTO {

    private Integer rowNo;
    private Integer columnNo;
    private SeatType seatType;
}
