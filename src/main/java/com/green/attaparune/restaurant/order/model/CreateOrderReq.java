package com.green.attaparune.restaurant.order.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderReq {
    private long orderId;
    private int reservationState;
}
