package com.yxs.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.UserBean;
import com.yxs.dao.UserDao;

@Service

public class logServiceImp implements logService {

	@Autowired
	private UserDao ud;
	
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return ud.getAllUsers();
	}
	
	
}
