package com.xyq.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xyq.ssm.service.IUserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class ControllerTest {

	@Autowired
	private IUserInfoService userService;
	 
	@Test  
    public void test() {  
		
		System.out.println(userService.getAll());
    } 
}
