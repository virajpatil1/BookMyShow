package com.project.bookmyshow.dtos;

import com.project.bookmyshow.enums.Language;
import com.project.bookmyshow.enums.MovieFeature;
import com.project.bookmyshow.models.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;



@Getter
public class CreateMovieDTO {

    private String name;
    private Double rating;
    private List<Language> languages = new ArrayList<>();
    private List<MovieFeature> features = new ArrayList<>();


    public Movie toMovie() {

        return Movie.builder()
                .name(name)
                .rating(rating)
                .languages(languages)
                .features(features)
                .build();
    }

}
