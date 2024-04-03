package com.project.bookmyshow.service;

import com.project.bookmyshow.exceptions.NoSuchElementException;
import com.project.bookmyshow.models.Movie;
import com.project.bookmyshow.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;
    public Movie getMovie(Long id) {

        return movieRepository.
                findById(id).
                orElseThrow(()-> new NoSuchElementException("Movie not found: " + id));
    }

    public Movie createMovie(Movie movie) {

        return movieRepository.save(movie);
    }


}
