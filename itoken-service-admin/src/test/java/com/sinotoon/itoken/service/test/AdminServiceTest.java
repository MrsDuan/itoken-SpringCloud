package com.sinotoon.itoken.service.test;

import com.sinotoon.itoken.service.admin.ServiceAdminApplication;
import com.sinotoon.itoken.service.admin.entity.UserInfo;
import com.sinotoon.itoken.service.admin.mapper.UserInfoMapper;
import com.sinotoon.itoken.service.admin.service.AdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
@ActiveProfiles(value = "dev")
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;
    @Test
    public void registry(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserCode("dddddddd");
        userInfo.setLoginCode("Mr Duan");
        userInfo.setPassword("123456");
        adminService.registry(userInfo);
    }
    @Test
    public void login(){
        UserInfo userInfo = adminService.login("Mr Duan", "123456");
        Assert.assertNotNull(userInfo);
    }
}
