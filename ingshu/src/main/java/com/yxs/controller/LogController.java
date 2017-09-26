package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.UserBean;
import com.yxs.dao.UserDao;
import com.yxs.service.UserService;

@Controller
@RequestMapping("/datamsg")
public class LogController {

	@Autowired
	private UserService us ;
	
	@RequestMapping("/demo1")
	public String UserList(int pageNum ,Model m) {
		PageInfo page = us.list(pageNum, 8, 5);
		List<UserBean> l = page.getList();
		m.addAttribute("userlist", l);
		return "/datamsg/demo1/userList.jsp";
		
	}
	@RequestMapping("/demo1")
	public String UserView() {
		return "/datamsg/demo1/userView.jsp";
		
	}
}
