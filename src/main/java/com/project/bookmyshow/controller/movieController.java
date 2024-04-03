package com.project.bookmyshow.controller;


import com.project.bookmyshow.dtos.CreateMovieDTO;
import com.project.bookmyshow.models.Movie;
import com.project.bookmyshow.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
@AllArgsConstructor
public class movieController {

    private MovieService movieService;
    //get all the movies

    @GetMapping("/{Id}")
    public Movie getMovie(@PathVariable Long Id){

        return movieService.getMovie(Id);
    }

    //create a movie
    @PostMapping
    public Movie createMovie(@RequestBody CreateMovieDTO request){

        //validateMovie(request);

        return movieService.createMovie(request.toMovie());
    }

//    private void validateMovie(CreateMovieDTO request) {
//
//
//    }
}
