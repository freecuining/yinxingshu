package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.ArchiveBean;
import com.yxs.bean.DeptBean;
import com.yxs.bean.MenuBean;
import com.yxs.bean.RoleBean;
import com.yxs.bean.UserBean;
import com.yxs.service.ArchiveService;
import com.yxs.service.DeptService;
import com.yxs.service.MenuService;
import com.yxs.service.RoleService;
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
	@Autowired
	private ArchiveService archiveService;
	@Autowired
	private RoleService roleService;
	
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
	public String showMenu(Integer pageNum, String menuName, Integer menuState,Model m){
		if(menuState == null){
			menuState = 999;
		}
		if(pageNum != null){
			info = menuService.getMenuBy(pageNum, State.PAGESIZE, State.PAGECOUNT, menuName, menuState);
		}else{
			pageNum=1;
			info = menuService.getMenuBy(pageNum, State.PAGESIZE, State.PAGECOUNT, menuName, menuState);
		}
		List<MenuBean> menuList = info.getList();
		m.addAttribute("page", info);
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
			return "/cn/viewDept";
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
	public String list(Integer pageNum, String userName, String roleName,
			String deptName,Model m){
		if(pageNum != null){
			info = userService.getAllUser(pageNum, State.PAGESIZE, State.PAGECOUNT,userName, roleName,
					deptName);
		}else{
			pageNum=1;
			info = userService.getAllUser(pageNum, State.PAGESIZE, State.PAGECOUNT,userName, roleName,
					deptName);
		}
		List<UserBean> userList = info.getList();
		m.addAttribute("userList",userList);
		m.addAttribute("page", info);
		return "/resource/demo2/list.jsp";
	}
	
	/**
	 * 添加之前的准备工作
	 * @param m
	 * @return
	 */
	@RequestMapping("/pinsertUser")
	public String pinsertUser(Model m){
		//查询到没有登陆账号的档案
		List<ArchiveBean> archiveList = archiveService.getArchiveNotUser();
		//查询所有部门名称
		List<DeptBean> deptList = deptService.getDeptNotChildDept();
		m.addAttribute("archiveList", archiveList);
		m.addAttribute("deptList", deptList);
		return "/resource/demo2/add.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/ajax")
	public List<RoleBean> getRoleByDeptId(Integer deptId){
		List<RoleBean> roleList = roleService.getRoleById(deptId);
		return roleList;
	}
}
