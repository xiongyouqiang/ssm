package com.xyq.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//告诉DispatcherServlet相关的容器， 这是一个Controller，

//类级别的RequestMapping，告诉DispatcherServlet由这个类负责处理URL。
//HandlerMapping依靠这个标签来工作
@Controller  
@RequestMapping(value="/heap")  
public class HeapOOmController {
	
	private static final Logger log = LoggerFactory.getLogger(HeapOOmController.class);
	
    private String oom;

    private double length;
	    
	StringBuffer tempOOM = new StringBuffer();

	
	public final static double OUTOFMEMORY = 500000000000d;

	 
	
	public String getOom() {
		return oom;
	}

	public double getLength() {
		return length;
	}
	
	 
	//方法级别的RequestMapping， 限制并缩小了URL路径匹配，同类级别的标签协同工作，最终确定拦截到的URL由那个方法处理
	//并指定访问方法为GET
	@RequestMapping(value="/heapOOM",method=RequestMethod.GET)  
	public String getUserInfo(Model model) {

		this.length = OUTOFMEMORY;

		int i = 0;
		while (i < OUTOFMEMORY) {
			i++;
			try {
				tempOOM.append("a");
			} catch (OutOfMemoryError e) {
				e.printStackTrace();
				break;
			}
		}
		this.oom = tempOOM.toString();

		log.info("长度:{}", getOom().length());

		return null;
	}
	  
	 
	  
}