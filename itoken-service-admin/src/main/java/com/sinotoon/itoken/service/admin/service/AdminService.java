package com.sinotoon.itoken.service.admin.service;

import com.sinotoon.itoken.service.admin.entity.UserInfo;

public interface AdminService {
    public void registry(UserInfo userInfo);

    public  UserInfo login(String loginCode,String plantPassword);
}
