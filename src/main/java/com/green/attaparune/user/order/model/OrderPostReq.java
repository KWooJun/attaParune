package com.green.attaparune.user.order.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPostReq {
    private long restaurantId;
    private long userId;
}
