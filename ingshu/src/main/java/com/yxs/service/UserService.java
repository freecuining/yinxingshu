package com.yxs.service;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.UserBean;

public interface UserService {

	public UserBean login(String loginName,String password);
	
	public void updateLoginNum(int userId);
	
}
