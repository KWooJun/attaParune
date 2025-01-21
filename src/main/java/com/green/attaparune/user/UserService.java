package com.green.attaparune.user;

import com.green.attaparune.common.model.ResultResponse;
import com.green.attaparune.user.model.UserSignInReq;
import com.green.attaparune.user.model.UserSignInRes;
import com.green.attaparune.user.model.UserSignUpReq;
import org.mindrot.jbcrypt.BCrypt;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    // 회원가입
    public ResultResponse<Integer> signUp(UserSignUpReq req) {
        String statusCode = "400";
        String resultMsg = "회원 가입에 실패했습니다.";

        // 비밀번호 암호화
        req.setUpw(BCrypt.hashpw(req.getUpw(), BCrypt.gensalt()));

        int result =  userMapper.insUser(req);

        if(result != 0) {
            statusCode = "200";
            resultMsg = "회원 가입이 완료됐습니다.";
        }

        return ResultResponse.<Integer>builder()
                .statusCode(statusCode)
                .resultMsg(resultMsg)
                .resultData(result)
                .build();
    }

    // 로그인
    public ResultResponse<UserSignInRes> signIn(UserSignInReq p) {
        String statusCode = "400";
        String resultMsg = "로그인 실패";

        UserSignInRes res = userMapper.selUserByUid(p.getUid());

        if(res == null) {
            res = new UserSignInRes();
            resultMsg = "아이디를 확인해 주세요.";
        } else if(!BCrypt.checkpw(p.getUpw(),res.getUpw())) {
            res = new UserSignInRes();
            resultMsg = "비밀번호를 확인해 주세요.";
        } else {
            statusCode = "200";
            resultMsg = "로그인 성공";
        }

        return ResultResponse.<UserSignInRes>builder()
                .statusCode(statusCode)
                .resultMsg(resultMsg)
                .resultData(res)
                .build();
    }
}
