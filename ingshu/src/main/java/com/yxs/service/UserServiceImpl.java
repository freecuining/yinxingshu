package com.yxs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.UserBean;
import com.yxs.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	public UserDao ud;

	public UserBean login(String loginName, String password) {
		return ud.login(loginName, password);
	}
}
