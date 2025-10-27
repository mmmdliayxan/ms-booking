package com.example.msbooking.model;

import com.example.msbooking.model.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ticketOrderId;
    private Long userId;
    private Long eventId;

    private int seatNumber;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}