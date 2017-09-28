package com.yxs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;



import com.github.pagehelper.PageInfo;
import com.yxs.bean.UserBean;


public interface UserService {




	public UserBean login(String loginName,String password);
	/**
	 * 张晓然 登录次数
	 * @param userId
	 */

	
	public void updateLoginNum(int userId);
	
	/**
	 * 张晓然 修改个人信息
	 * @param ub
	 */
	public boolean updateInfo(UserBean ub);
	
	
	/**
	 * 崔宁
	 * 查询所有用户信息
	 * @return
	 */
	public PageInfo getAllUser(int pageNum,int pageSize,int pageCount,String userName,String roleName,String deptName);
}
