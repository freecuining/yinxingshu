package com.yxs.dao;

import org.springframework.stereotype.Repository;

import com.yxs.bean.UserBean;

@Repository
public interface UserDao {
	public UserBean login(String loginName,String password);
	
}
