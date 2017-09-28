package com.yxs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.DeptBean;
import com.yxs.bean.MenuBean;
import com.yxs.bean.RoleBean;
import com.yxs.bean.RoleMenuBean;
import com.yxs.service.DeptService;
import com.yxs.service.MenuService;
import com.yxs.service.RoleService;
import com.yxs.util.State;

@Controller
@RequestMapping("/cnRole")
public class RoleController {

	@Autowired
	private RoleService roleService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private DeptService deptService;
	
	private PageInfo info;
	
	/**
	 * 分页加模糊查询职位信息
	 * @param pageNum
	 * @param roleName
	 * @param deptName
	 * @param m
	 * @return
	 */
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
	
	@RequestMapping("/getRoleById")
	public String getRoleById(Integer roleId,Model m){
		//调用查询职位信息方法
		RoleBean roleBean = roleService.getRoleByRoleId(roleId);
		m.addAttribute("roleBean", roleBean);
		return "/resource/demo3/view.jsp";
	}
	
	
	@RequestMapping("/pupdateRole")
	public String pupdateRole(Integer roleId,Model m){
		RoleBean roleBean = roleService.getRoleByRoleId(roleId);
		List<MenuBean> menuRoleList = roleService.getMenuByRoleId(roleId);
		List<MenuBean> menuAllList = menuService.getMenu();
		for(int i=0;i<menuRoleList.size();i++){
			MenuBean menuBean1 = menuRoleList.get(i);
			for(int j=0;j<menuAllList.size();j++){
				MenuBean menuBean2 = menuAllList.get(j);
				if(menuBean1.getMenuId()==menuBean2.getMenuId()){
					menuBean2.setMenuSelect(1);
				}
			}
		}
		m.addAttribute("menuAllList", menuAllList);
		m.addAttribute("roleBean", roleBean);
		return "/resource/demo3/edit.jsp";
	}
	
	
	@RequestMapping("/updateRole")
	public String updateRole(Integer roleId,Integer[] menuId,Model m){
		List<RoleMenuBean> list = new ArrayList<RoleMenuBean>();
		for(int i=0;i<menuId.length;i++){
			RoleMenuBean roleMenuBean = new RoleMenuBean();
			roleMenuBean.setMenuId(menuId[i]);
			roleMenuBean.setRoleId(roleId);
			list.add(roleMenuBean);
		}
		boolean is = roleService.insertManyRoles(list,roleId);
		if(is){
			return "/cnRole/getRoles";
		}else{
			return "/cnRole/pupdateRole";
		}
		
	}
	
	/**
	 * 预添加方法
	 * @param roleId
	 * @param menuId
	 * @param m
	 * @return
	 */
	@RequestMapping("/pinsertRole")
	public String pInsertRole(Model m){
		//查询所有部门
		List<DeptBean> deptList = deptService.getDept();
		//查书勋所有菜单资源
		List<MenuBean> menuList = menuService.getMenu();
		m.addAttribute("deptList",deptList);
		m.addAttribute("menuList", menuList);
		return "/resource/demo3/add.jsp";
	}
	
	/**
	 * 添加一个职位
	 * @param roleBean
	 * @param menuId
	 * @param m
	 * @return
	 */
	@RequestMapping("/insertRole")//@RequestParam("menuId")
	public String insertRole(RoleBean roleBean,Integer[] menuId,Model m){
		roleBean.setRoleDel(0);
		boolean is = roleService.insertRole(roleBean,menuId);
		if(is){
			return "/cnRole/getRoles";
		}else{
			return "/cnRole/pinsertRole";
		}
	}
	
	/**
	 * 删除职位信息
	 * @param roleBean
	 * @param menuId
	 * @param m
	 * @return
	 */
	@RequestMapping("/deleteRole")//@RequestParam("menuId")
	public String deleteRole(Integer roleId,Model m){
		boolean is = roleService.deleteRole(roleId);
		if(is){
			return "/cnRole/getRoles";
		}else{
			return "/cnRole/getRoles";
		}
	} 
}
