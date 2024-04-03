package com.project.bookmyshow.service;

import com.project.bookmyshow.dtos.ShowRequestDTO;
import com.project.bookmyshow.exceptions.NoSuchElementException;
import com.project.bookmyshow.models.*;
import com.project.bookmyshow.repositories.ShowRepository;
import com.project.bookmyshow.repositories.ShowSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShowService {

    private ShowRepository showRepository;
    private ScreenService screenService;
    private MovieService movieService;
    private SeatService seatService;
    private ShowSeatRepository seatRepository;

    public Show getShow(Long id) {

        return showRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Invalid show ID:" + id));

    }

    public Show createShow(ShowRequestDTO request) {

        Screen screen = screenService.getScreen(request.getScreen_id());

        Movie movie = movieService.getMovie(request.getMovie_id());

        Show show = Show.builder()
                .screen(screen)
                .movie(movie)
                .startTime(request.getStartTime())
                .duration(request.getDuration())
                .build();

        Show savedshow = showRepository.save(show);

        List<Seat> seats = seatService.getAll(request.getScreen_id());

        List<ShowSeat> showSeats = seats.stream()
                .map( seat ->
                        ShowSeat.builder()
                                .seat(seat)
                                .show(savedshow)
                                .build()


                ).toList();

        seatRepository.saveAll(showSeats);

        return showRepository.save(
                show.toBuilder()
                        .showSeats(showSeats)
                        .build()
        );


    }
}
