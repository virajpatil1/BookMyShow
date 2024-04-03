package com.project.bookmyshow.repositories;

import com.project.bookmyshow.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeatRepository extends JpaRepository<Seat ,Long> {

    //Optional<Seat> findSeatByColumnNoAndRowNo(Integer columnNo, Integer rowNo);

    public List<Seat> findAllByScreen_Id(Long id);
}
