package com.project.bookmyshow.repositories;

import com.project.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {
}
