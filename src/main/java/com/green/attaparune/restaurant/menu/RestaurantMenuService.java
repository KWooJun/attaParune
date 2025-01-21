package com.green.attaparune.restaurant.menu;


import com.green.attaparune.restaurant.menu.model.InsMenuReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantMenuService {
    private final RestaurantMenuMapper restaurantMenuMapper;

    public int postMenu(InsMenuReq p){
        int result = restaurantMenuMapper.insMenu(p);
        return result;
    }
}
