package com.green.attaparune.user;

import com.green.attaparune.common.model.ResultResponse;
import com.green.attaparune.user.model.UserSignInReq;
import com.green.attaparune.user.model.UserSignInRes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
@Tag(name="유저", description = "유저 관련 API")
public class UserController {
    private final UserService userService;

    @PostMapping("sign-in")
    @Operation(summary = "로그인")
    public ResultResponse<UserSignInRes> signIn(@RequestBody UserSignInReq p) {
        UserSignInRes res = userService.signIn(p);

        return ResultResponse.<UserSignInRes>builder()
                .statusCode("200")
                .resultMsg(res.getMessage())
                .resultData(res)
                .build();
    }
}
