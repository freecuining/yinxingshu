package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yxs.bean.DeptBean;
import com.yxs.bean.MenuBean;
import com.yxs.service.DeptService;
import com.yxs.service.MenuService;

@Controller
@RequestMapping("/cn")
@SessionAttributes({"deptList"})
public class SystemController {

	@Autowired
	private DeptService deptService;
	@Autowired
	private MenuService menuService;
	
	/**
	 *系统管理中的部门管理
	 * @param m
	 * @return
	 */
	@RequestMapping("/viewDept")
	public String showDept(Model m){
		List<DeptBean> deptList = deptService.getDept();
		m.addAttribute("deptList", deptList);
		return "/resource/demo1/iframe.jsp";
	}
	
	/**
	 * 查询所有菜单
	 * @param m
	 * @return
	 */
	@RequestMapping("/viewMenu")
	public String showMenu(Model m){
		List<MenuBean> menuList = menuService.getMenu();
		m.addAttribute("menuList", menuList);
		return "/resource/demo8/list.jsp";
	}
	
	/**
	 * 根据id查询部门信息
	 * @param m
	 * @return
	 */
	@RequestMapping("/queryDept")
	public String queryDeptById(int deptId,Model m){
		DeptBean deptBean = deptService.getDeptById(deptId);
		List<DeptBean> deptList = deptService.getDept();
		m.addAttribute("deptList", deptList);
		m.addAttribute("deptBean", deptBean);
		return "/resource/demo1/view.jsp";
	}
	
	/**
	 * 预修改方法
	 * @param m
	 * @return
	 */
	@RequestMapping("/pupdateDept")
	public String pupdateDeptById(int deptId,Model m){
		DeptBean deptBean = deptService.getDeptById(deptId);
		List<DeptBean> deptList = deptService.getDept();
		m.addAttribute("deptList", deptList);
		m.addAttribute("deptBean", deptBean);
		return "/resource/demo1/edit.jsp";
	}
	
}
