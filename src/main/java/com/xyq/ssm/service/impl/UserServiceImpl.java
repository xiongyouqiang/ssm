package com.xyq.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.xyq.ssm.pojo.UserInfo;
import com.xyq.ssm.service.IUserInfoService;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserInfoService {

	
	@Override
	public void add(UserInfo UserInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(UserInfo UserInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeByPk(Integer pk) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserInfo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo getByPk(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> getByCond(UserInfo UserInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> getByCond(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
