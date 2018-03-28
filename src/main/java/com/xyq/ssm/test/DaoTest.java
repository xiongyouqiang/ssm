package com.xyq.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.xyq.ssm.dao.UserInfoMapper;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring*.xml"}) 
@Transactional 
public class DaoTest {

	@Autowired 
	private UserInfoMapper userMapper;
	
	@Test
	public void testSelect(){
		
		System.out.println(userMapper.getAllUserInfo());
	}
}
