package com.xyq.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyq.ssm.dao.UserInfoMapper;
import com.xyq.ssm.pojo.UserInfo;
import com.xyq.ssm.service.IUserInfoService;

@Service("userService")
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public void add(UserInfo userInfo) {
		
		userInfoMapper.insert(userInfo);
	}

	@Override
	public void remove(UserInfo userInfo) {

		userInfoMapper.deleteByPrimaryKey(userInfo.getUserId());
	}

	@Override
	public void removeByPk(Integer pk) {
		userInfoMapper.deleteByPrimaryKey(pk);
	}

	@Override
	public List<UserInfo> getAll() {
		
		return userInfoMapper.getAllUserInfo();
	}

	@Override
	public UserInfo getByPk(Integer pk) {
		
		return userInfoMapper.selectByPrimaryKey(pk);
	}

	@Override
	public List<UserInfo> getByCond(UserInfo userInfo) {
		
		return null;
	}

	@Override
	public List<UserInfo> getByCond(Map<String, Object> map) {
		return null;
	}

	@Override
	public int updateByPrimaryKey(UserInfo record) {
		return userInfoMapper.updateByPrimaryKey(record);
	}

}
