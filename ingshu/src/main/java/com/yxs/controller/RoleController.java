package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.RoleBean;
import com.yxs.service.RoleService;
import com.yxs.util.State;

@Controller
@RequestMapping("/cnRole")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	private PageInfo info;
	
	@RequestMapping("/getRoles")
	public String getRoles(Integer pageNum, String roleName, String deptName,Model m){
		if(pageNum != null){
			info = roleService.getRoleByParam(pageNum, State.PAGESIZE, State.PAGECOUNT, roleName, deptName);
		}else{
			pageNum=1;
			info = roleService.getRoleByParam(pageNum, State.PAGESIZE, State.PAGECOUNT, roleName, deptName);
		}
		List<RoleBean> roleList = info.getList();
		m.addAttribute("roleList", roleList);
		m.addAttribute("page", info);
		return "/resource/demo3/list.jsp";
	}
	
	
}
