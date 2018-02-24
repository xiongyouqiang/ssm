package com.xyq.ssm.service;

import java.util.List;
import java.util.Map;

import com.xyq.ssm.pojo.UserInfo;
/***
 * 
* @ClassName: IUserInfoService 
* @Description: TODO(用户服务层定义接口，定义用户的增删改查方法) 
* @author youqiang.xiong
* @date 2018年1月9日 上午11:30:29 
*
*/
public interface IUserInfoService {

	public void  add(UserInfo UserInfo);

	public void remove(UserInfo UserInfo);
	
	public void removeByPk(Integer pk);
	
	public List<UserInfo> getAll();
	
	public UserInfo getByPk(Integer pk);
	
	public List<UserInfo> getByCond(UserInfo UserInfo);
	
	public List<UserInfo> getByCond(Map<String, Object> map);
	
	public int updateByPrimaryKey(UserInfo record);
	
}
