package com.example.msbooking.repository;

import com.example.msbooking.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    boolean existsByEventIdAndSeatNumber(Long eventId, int seatNumber);
}