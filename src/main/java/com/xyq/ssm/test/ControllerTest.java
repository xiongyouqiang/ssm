package com.xyq.ssm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xyq.ssm.dao.UserInfoMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class ControllerTest {

	/*@Autowired
	private IUserInfoService userService;*/
	
	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Test  
    public void test() {  
		
		System.out.println(userInfoMapper.getAllUserInfo());
    } 
}
