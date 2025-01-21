package com.green.attaparune.user;

import com.green.attaparune.user.model.UserSignInRes;
import com.green.attaparune.user.model.UserSignUpReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserSignUpReq req);
    UserSignInRes selUserByUid(String uid);
}
