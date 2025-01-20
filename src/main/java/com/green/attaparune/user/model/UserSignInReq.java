package com.green.attaparune.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(description = "회원 로그인 정보")
public class UserSignInReq {
    @Schema(description = "아이디", example = "test", requiredMode = Schema.RequiredMode.REQUIRED)
    private String uid;
    @Schema(description = "비밀번호", example = "1212", requiredMode = Schema.RequiredMode.REQUIRED)
    private String upw;
}
