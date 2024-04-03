package com.project.bookmyshow.service;


import com.project.bookmyshow.dtos.CreateSeatDTO;
import com.project.bookmyshow.exceptions.SeatBookedErrorException;
import com.project.bookmyshow.exceptions.SeatNotFoundException;
import com.project.bookmyshow.models.Seat;
import com.project.bookmyshow.repositories.SeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SeatService {

    private SeatRepository seatRepository;

    public List<Seat> getAll(Long screenId) {

       return seatRepository.findAllByScreen_Id(screenId);
    }

//    public Seat getSeats(Integer colNo, Integer rowNo){
//
//        return seatRepository.findSeatByColumnNoAndRowNo(colNo,rowNo)
//                .orElseThrow(() -> new SeatNotFoundException(colNo,rowNo));
//
//    }
//    public Seat createSeat(CreateSeatDTO request) {
//
//        Optional<Seat> seatExists = seatRepository.findSeatByColumnNoAndRowNo(request.getColumnNo(),request.getRowNo());
//
//        if(seatExists.isPresent()){
//            throw new SeatBookedErrorException(request.getRowNo(),request.getColumnNo());
//        }
//
//        Seat seat = Seat.builder()
//                .columnNo(request.getColumnNo())
//                .rowNo(request.getRowNo())
//                .seatType(request.getSeatType())
//                .build();
//
//
//        return seatRepository.save(seat);
//    }


}
