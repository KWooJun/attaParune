package com.green.attaparune.restaurant.menu;


import com.green.attaparune.common.model.ResultResponse;
import com.green.attaparune.restaurant.menu.model.InsMenuReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restaurant/menu")
@RequiredArgsConstructor
public class RestaurantMenuController {
    private final RestaurantMenuService restaurantMenuService;

    @PostMapping
    public ResultResponse<Integer> postMenu(@RequestBody InsMenuReq p){
        int result = restaurantMenuService.postMenu(p);

        return ResultResponse.<Integer>builder()
                .statusCode("200")
                .resultMsg("메뉴 등록")
                .resultData(result)
                .build();
    }
}
