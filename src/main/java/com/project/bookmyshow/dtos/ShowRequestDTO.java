package com.project.bookmyshow.dtos;


import com.project.bookmyshow.models.Movie;
import com.project.bookmyshow.models.Screen;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ShowRequestDTO {
    private Long movie_id;

    private Long screen_id;
    private Date startTime;
    private Integer duration;
}
