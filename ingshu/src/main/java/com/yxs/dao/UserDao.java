package com.yxs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yxs.bean.UserBean;

@Repository
public interface UserDao {
	public UserBean login(String loginName,String password);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 崔宁
	 * 查询所有用户信息
	 * @return
	 */
	public List<UserBean> getAllUser();
}
