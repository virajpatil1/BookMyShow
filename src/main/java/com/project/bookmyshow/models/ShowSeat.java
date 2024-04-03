package com.project.bookmyshow.models;

import com.project.bookmyshow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeat extends BaseModel {

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated
    private SeatStatus status;

}