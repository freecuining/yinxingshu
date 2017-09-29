package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.MenuBean;
import com.yxs.bean.RoleBean;
import com.yxs.bean.RoleMenuBean;

public interface RoleService {

	/**
	 * 查询该部门下的所有职位
	 * @param deptId
	 * @return
	 */
	public List<RoleBean> getRoleById(int deptId);
	
	/**
	 * 查询所有职位信息(分页加模糊查询)
	 */
	public PageInfo getRoleByParam(int pageNum,int pageSize,int pageCount, String roleName, String deptName);
	
	/**
	 * 根据职位id查询职位信息
	 * @param roleId
	 * @return
	 */
	public RoleBean getRoleByRoleId(int roleId);
	
	
	/**
	 * 查询该职位下的所有菜单信息
	 * @param roleId
	 * @return
	 */
	public List<MenuBean> getMenuByRoleId(int roleId);
	
	/**
	 * 查询所有职位
	 * @return
	 */
	public List<RoleBean> selectRole();
	
	/**
	 * 删除当前角色之前的权限
	 * 批量插入,赋予权限
	 * @param list
	 * @param roleId
	 * @return
	 */
	public boolean insertManyRoles(List<RoleMenuBean> list,Integer roleId);
	
	/**
	 * 添加职位信息
	 * @param roleBean
	 * @return
	 */
	public boolean insertRole(RoleBean roleBean,Integer[] menuId);
	
	
	/**
	 * 查询最大id值
	 * @return
	 */
	public int getMaxRoleId();
	
	/**
	 * 状态删除职位信息
	 * @param roleId
	 * @return
	 */
	public boolean deleteRole(int roleId);
	
}
