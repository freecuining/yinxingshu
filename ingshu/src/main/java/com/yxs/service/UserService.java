package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.UserBean;

public interface UserService {

	public UserBean login(String loginName,String password);
	
	public void updateLoginNum(int userId);
	
	
	
	
	/**
	 * 崔宁
	 * 查询所有用户信息
	 * @return
	 */
	public PageInfo getAllUser(int pageNum,int pageSize,int pageCount);
}
