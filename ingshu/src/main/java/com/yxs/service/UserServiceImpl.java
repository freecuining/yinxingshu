package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.UserBean;
import com.yxs.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao ud;
	//登录
	public UserBean login(String loginName, String password) {
		return ud.login(loginName, password);
	}
	
	//登录次数
	public void updateLoginNum(int userId) {
	ud.updateLoginNum(userId);
	}
	
	
	
}
