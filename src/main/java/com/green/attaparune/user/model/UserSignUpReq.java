package com.green.attaparune.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(title = "유저 회원가입")
public class UserSignUpReq {
    @JsonIgnore
    private long userId;

    @NotEmpty(message = "사용자 이름을 입력해주세요.")
    @Schema(title = "사용자 이름", example = "홍길동", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @NotEmpty(message = "이메일을 입력해주세요.")
    @Schema(title = "사용자 이메일", example = "test@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private String email;

    @NotEmpty(message = "비밀번호를 입력해주세요.")
    @Schema(title = "사용자 비밀번호", example = "1234", requiredMode = Schema.RequiredMode.REQUIRED)
    private String upw;

    @NotEmpty(message = "연락처를 입력해주세요.")
    @Schema(title = "사용자 연락처", example = "01012345678", requiredMode = Schema.RequiredMode.REQUIRED)
    private String phone;

    private long companyId;

    private String roleId = "ROLE_USER";
}
