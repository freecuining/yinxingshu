package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.SalaryBean;
import com.yxs.bean.UserBean;
import com.yxs.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao ud;

	public UserBean login(String loginName, String password) {
		return ud.login(loginName, password);
	}
	
	//登录次数
	public void updateLoginNum(int userId) {
		ud.updateLoginNum(userId);
	}
	
	
	

	
	/**
	 * 崔宁
	 * 查询所有用户信息
	 * @return
	 */
	public PageInfo getAllUser(int pageNum,int pageSize,int pageCount) {
		PageHelper.startPage(pageNum, pageSize);
		List<UserBean> userList = ud.getAllUser();
		PageInfo<Object> info = new PageInfo(userList,pageCount);
		return info;
	}
}
