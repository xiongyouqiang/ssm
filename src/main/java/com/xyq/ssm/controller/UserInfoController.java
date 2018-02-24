package com.xyq.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.xyq.ssm.pojo.UserInfo;
import com.xyq.ssm.service.IUserInfoService;

//url:  http://localhost:8080/ssm/userinfo/getUserInfo

//告诉DispatcherServlet相关的容器， 这是一个Controller，

//类级别的RequestMapping，告诉DispatcherServlet由这个类负责处理URL。
//HandlerMapping依靠这个标签来工作
@Controller  
@RequestMapping(value="/userinfo")  
public class UserInfoController {
	
	@Autowired
	private IUserInfoService userService;
		
	//方法级别的RequestMapping， 限制并缩小了URL路径匹配，同类级别的标签协同工作，最终确定拦截到的URL由那个方法处理
	//并指定访问方法为GET
	  @RequestMapping(value="/getUserInfo",method=RequestMethod.GET)  
	  public String getUserInfo(Model model){  
		  
	      List<UserInfo> userinfos = userService.getAll(); 
	      Object json =  JSON.toJSON(userinfos);
	      model.addAttribute("users",json);
	      //视图渲染，/WEB-INF/view/userInfo.jsp
	      return "userInfo";  //页面的名称，根据此字符串会去寻找名为userInfo.jsp的页面
	   }
	  
	  @RequestMapping(value="/addUser",method=RequestMethod.POST)
	  public String addUser(@ModelAttribute("user") UserInfo user,Model model){

		  userService.add(user);
		  model.addAttribute("user",user);
		  return "userInfo"; 
	  }
	   
	  
	  	@RequestMapping("/showInfos")  
	    public @ResponseBody Object showUserInfos(){  
	        List<UserInfo> userInfos = userService.getAll(); 
	        return userInfos;  
	    }  
	  
}