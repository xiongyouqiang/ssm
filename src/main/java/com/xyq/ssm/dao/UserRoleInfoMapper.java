package com.xyq.ssm.dao;

import com.xyq.ssm.pojo.UserRoleInfo;

public interface UserRoleInfoMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(UserRoleInfo record);

    int insertSelective(UserRoleInfo record);

    UserRoleInfo selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(UserRoleInfo record);

    int updateByPrimaryKey(UserRoleInfo record);
}