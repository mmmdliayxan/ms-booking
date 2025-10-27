package com.example.msbooking.controller;

import com.example.msbooking.dto.TicketOrderDto;
import com.example.msbooking.model.enums.ReservationStatus;
import com.example.msbooking.service.ReservationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking")
@RequiredArgsConstructor
@Slf4j
public class BookingController {

    private final ReservationService service;

    @PostMapping("/reserve")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> reserveSeat(@RequestBody TicketOrderDto order) {
        log.info("API call: reserveSeat for orderId={} userId={}", order.getTicketOrderId(), order.getUserId());
        service.reserveSeat(order);
        return ResponseEntity.ok("Reservation successful");
    }
}