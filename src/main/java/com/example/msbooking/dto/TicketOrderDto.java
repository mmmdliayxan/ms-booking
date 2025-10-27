package com.example.msbooking.dto;

import lombok.Data;

@Data
public class TicketOrderDto {
    private Long ticketOrderId;
    private Long userId;
    private String userPhone;
    private Long eventId;
    private int quantity;
}
