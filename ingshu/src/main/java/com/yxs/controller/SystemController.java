package com.yxs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.DeptBean;
import com.yxs.bean.MenuBean;
import com.yxs.bean.SalaryBean;
import com.yxs.bean.UserBean;
import com.yxs.service.DeptService;
import com.yxs.service.MenuService;
import com.yxs.service.UserService;
import com.yxs.util.State;

@Controller
@RequestMapping("/cn")
@SessionAttributes({"deptList"})
public class SystemController {

	@Autowired
	private DeptService deptService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private UserService userService;
	private PageInfo info;
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
		//判断当前部门是否有子部门
		boolean isok = deptService.queryChildDept(deptId);
		m.addAttribute("isok", isok);
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
	
	/**
	 * 根据id修改部门信息
	 * @param m
	 * @return
	 */
	@RequestMapping("/updateDept")
	public String updateDeptById(DeptBean deptBean,Model m){
		boolean is = deptService.updateDeptById(deptBean);
		if(is){
			m.addAttribute("msg", "修改成功");
			return "/cn/queryDept";
		}else{
			m.addAttribute("msg", "修改失败");
			return "cn/pupdateDept?deptId="+deptBean.getDeptId();
		}
	}
	
	/**
	 * 添加之前的准备工作
	 * @param m
	 * @return
	 */
	@RequestMapping("/pinsertDept")
	public String pinsertDept(int deptId,Model m){
		DeptBean deptBean = deptService.getDeptById(deptId);
		int deptCode = Integer.parseInt(deptService.getMaxDeptCode());
		m.addAttribute("deptId", deptId);
		m.addAttribute("deptCode", deptCode);
		m.addAttribute("deptBean", deptBean);
		return "/resource/demo1/add.jsp";
	}
	
	/**
	 * 添加一个部门
	 * @param m
	 * @return
	 */
	@RequestMapping("/insertDept")
	public String insertDept(DeptBean deptBean,Model m){
		deptBean.setDeptDel(State.UNDELETE);
		boolean isok = deptService.insertDept(deptBean);
		if(isok){
			m.addAttribute("msg", "添加成功");
			return "/resource/demo1/wecom.jsp";
		}else{
			m.addAttribute("msg", "添加失败");
			return "/cn/pinsertDept";
		}
	}
	
	/**
	 * 删除部门
	 * @return
	 */
	@RequestMapping("/deleteDept")
	public String deleteDeptById(int deptId,Model m){
		boolean isok = deptService.deleteDeptById(deptId);
		if(isok){
			m.addAttribute("msg", "删除成功");
			return "/resource/demo1/iframe.jsp";
		}else{
			m.addAttribute("msg", "删除失败");
			return "/resource/demo1/view.jsp";
		}
	}
	
	
	/**
	 * 查询所有用户信息
	 * @param deptId
	 * @param m
	 * @return
	 */
	@RequestMapping("/getUser")
	public String list(int pageNum,Model m){
		if(pageNum != 0){
			info = userService.getAllUser(pageNum, State.PAGESIZE, State.PAGECOUNT);
		}else{
			pageNum=1;
			info = userService.getAllUser(pageNum, State.PAGESIZE, State.PAGECOUNT);
		}
		//info.getNavigatepageNums();  页面显示12345   ..678910..  格式
		//info.getTotal();
		List<UserBean> userList = info.getList();
		m.addAttribute("userList",userList);
		m.addAttribute("page", info);
		return "/resource/demo2/list.jsp";
	}
}
