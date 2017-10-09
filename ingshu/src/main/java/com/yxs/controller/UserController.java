package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yxs.bean.DeptBean;
import com.yxs.bean.RoleBean;
import com.yxs.bean.UserBean;
import com.yxs.service.DeptService;
import com.yxs.service.RoleService;
import com.yxs.service.UserService;

@Controller
@RequestMapping("/cnUser")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private DeptService deptService;
	
	/**
	 * 根据用户id查询所有用户信息
	 * @param userId
	 * @param m
	 * @return
	 */
	@RequestMapping("/getUser")
	public String getUserById(Integer userId,Model m){
		UserBean userBean = userService.getUserById(userId);
		m.addAttribute("userBean", userBean);
		return "/resource/demo2/view.jsp";
	}
	
	/**
	 * 预修改方法
	 * @param userId
	 * @param m
	 * @return
	 */
	@RequestMapping("/pupdateUser")
	public String pupdateUser(Integer userId,Model m){
		UserBean userBean = userService.getUserById(userId);
		List<RoleBean> roleList = roleService.selectRole();
		List<DeptBean> deptList = deptService.getDept();
		m.addAttribute("userBean", userBean);
		m.addAttribute("roleList", roleList);
		m.addAttribute("deptList", deptList);
		return "/resource/demo2/edit.jsp";
	}
}
