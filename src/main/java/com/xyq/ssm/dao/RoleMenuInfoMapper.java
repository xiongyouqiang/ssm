package com.xyq.ssm.dao;

import com.xyq.ssm.pojo.RoleMenuInfo;

public interface RoleMenuInfoMapper {
    int deleteByPrimaryKey(Integer roleMenuId);

    int insert(RoleMenuInfo record);

    int insertSelective(RoleMenuInfo record);

    RoleMenuInfo selectByPrimaryKey(Integer roleMenuId);

    int updateByPrimaryKeySelective(RoleMenuInfo record);

    int updateByPrimaryKey(RoleMenuInfo record);
}