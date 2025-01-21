package com.green.attaparune.user.restaurant.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantGetReq {
    private long userId;
    private long restaurantId;
    private int status;
}
