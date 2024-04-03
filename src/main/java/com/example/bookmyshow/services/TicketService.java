package com.example.bookmyshow.services;

import com.example.bookmyshow.exceptions.InvalidUser;
import com.example.bookmyshow.exceptions.SeatsAlreadyBookedException;
import com.example.bookmyshow.models.Ticket;

import java.util.List;

public interface TicketService {

    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws SeatsAlreadyBookedException, InvalidUser;
}

