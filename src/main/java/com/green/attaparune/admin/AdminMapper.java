package com.green.attaparune.admin;

import com.green.attaparune.admin.model.AdminSignUpReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    int insAdmin(AdminSignUpReq p);
}
