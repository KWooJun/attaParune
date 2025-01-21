package com.green.attaparune.user.reservation.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReservationPostReq {
    private long orderId;
    private int reservationPeopleCount;
    private String userPhone;
    private LocalDateTime reservationTime;
}
