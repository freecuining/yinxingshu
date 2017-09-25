package com.yxs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yxs.bean.UserBean;

@Repository
public interface UserDao {

	@Autowired
	UserBean ub = new UserBean();
	
	/**
	 * 
	 */
	
	public UserBean getUserById(int userId);

	public List<UserBean> getAllUsers();
}
