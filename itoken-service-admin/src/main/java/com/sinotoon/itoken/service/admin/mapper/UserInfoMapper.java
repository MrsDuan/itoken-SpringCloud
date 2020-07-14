package com.sinotoon.itoken.service.admin.mapper;

import com.sinotoon.itoken.service.admin.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String userCode);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userCode);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}