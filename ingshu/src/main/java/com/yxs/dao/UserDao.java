package com.yxs.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Repository;

import com.yxs.bean.UserBean;

@Repository
public interface UserDao {


	@Autowired
	UserBean ub = new UserBean();

	public UserBean login(@Param("loginName") String loginName, @Param("password") String password);

	public void updateLoginNum(int userId);


	/**
	 * 
	 */
	
	public UserBean getUserById(int userId);

	/**
	 * 崔宁
	 * 查询所有用户信息
	 * @return
	 */
	public List<UserBean> getAllUser(@Param("userName")String userName,@Param("roleName")String roleName,@Param("deptName")String deptName);
	public List<UserBean> getAllUser();

}
