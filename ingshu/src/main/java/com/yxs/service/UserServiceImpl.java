package com.yxs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.yxs.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao us;
	public PageInfo list(int pageNum, int i, int j) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
