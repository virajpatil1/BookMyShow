package com.project.bookmyshow.controller;

import com.project.bookmyshow.dtos.CreateSeatDTO;
import com.project.bookmyshow.enums.SeatType;
import com.project.bookmyshow.exceptions.SeatTypeErrorException;
import com.project.bookmyshow.models.Seat;
import com.project.bookmyshow.service.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seat")
public class seatController {

//
//    @GetMapping("/seats/{column}/{row}")
//    public Seat getSeat(@PathVariable Integer column,
//                        @PathVariable Integer row){
//
//
//        return seatService.getSeats(column,row);
//    }
//
//
//    @PostMapping
//    public Seat createSeat(@RequestBody CreateSeatDTO request){
//
//       if(!validateSeat(request)){
//           throw new SeatTypeErrorException(request.getSeatType());
//       }
//
//       return seatService.createSeat(request);
//    }
//
//    private boolean validateSeat(CreateSeatDTO request) {
//
//        for (SeatType validSeatType : SeatType.values()) {
//
//            if (validSeatType.equals(request.getSeatType())) {
//                return true;
//            }
//        }
//        return false;
//    }
}
