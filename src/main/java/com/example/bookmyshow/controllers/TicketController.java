package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.BookTicketRequestDto;
import com.example.bookmyshow.dtos.BookTicketResponseDto;
import com.example.bookmyshow.exceptions.BookTicketRequestValidationException;
import com.example.bookmyshow.exceptions.InvalidUser;
import com.example.bookmyshow.exceptions.SeatsAlreadyBookedException;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDto bookTicket(BookTicketRequestDto dto){
        try {
            validateRequest(dto);
            Ticket ticket = ticketService.bookTicket(dto.getShowSeatIds(), dto.getUserId());
            return BookTicketResponseDto.getSuccessResponse(ticket);
        }catch (BookTicketRequestValidationException | SeatsAlreadyBookedException | InvalidUser e){
            return BookTicketResponseDto.getFailureResponse(e.getMessage());
        }catch (Exception e){
            System.out.println("Unhandled exception:" + e.getMessage());
            return BookTicketResponseDto.getFailureResponse(e.getMessage());
        }

    }

    private void validateRequest(BookTicketRequestDto dto) throws BookTicketRequestValidationException{
        if(dto.getUserId() < 0){
            throw  new BookTicketRequestValidationException("Invalid user id");
        }
        if(dto.getShowSeatIds() == null){
            throw new BookTicketRequestValidationException("Seats not selected");
        }

        if(dto.getShowSeatIds().size() == 0){
            throw new BookTicketRequestValidationException("Atleast 1 seat should be selected");
        }

        if(dto.getShowSeatIds().size() > 10){
            throw new BookTicketRequestValidationException("More than 10 seats can not be selected");
        }

    }

}
