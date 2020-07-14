package com.sinotoon.itoken.service.admin.service.impl;

import com.sinotoon.itoken.service.admin.entity.UserInfo;
import com.sinotoon.itoken.service.admin.mapper.UserInfoMapper;
import com.sinotoon.itoken.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void registry(UserInfo userInfo) {
        System.out.println("我是"+userInfoMapper);
        userInfoMapper.insert(userInfo);
    }

    @Override
    public UserInfo login(String loginCode, String plantPassword) {
        return null;
    }
}
