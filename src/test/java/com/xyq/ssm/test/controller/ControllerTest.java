package com.xyq.ssm.test.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xyq.ssm.service.IUserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class ControllerTest {

	@Autowired
	private IUserInfoService userServiceImpl;
	
	@Test  
    public void test() {  
		
		System.out.println(userServiceImpl.getAll());
    } 
}
