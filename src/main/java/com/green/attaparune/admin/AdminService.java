package com.green.attaparune.admin;

import com.green.attaparune.admin.model.AdminSignUpReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminMapper adminMapper;

    public int adminSignUp(AdminSignUpReq p){
        int result = adminMapper.insAdmin(p);
        return result;
    }
}
