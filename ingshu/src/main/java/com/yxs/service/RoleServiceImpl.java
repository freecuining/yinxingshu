package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.MenuBean;
import com.yxs.bean.RoleBean;
import com.yxs.bean.RoleMenuBean;
import com.yxs.dao.RoleDao;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	/**
	 * 查询该部门下的所有职位
	 * @param deptId
	 * @return
	 */
	public List<RoleBean> getRoleById(int deptId){
		return roleDao.getRoleById(deptId);
	}

	
	/**
	 * 查询所有职位信息(分页加模糊查询)
	 */
	public PageInfo getRoleByParam(int pageNum, int pageSize, int pageCount, String roleName, String deptName) {
		PageHelper.startPage(pageNum, pageSize);
		List<RoleBean> roleList = roleDao.getRole(roleName,deptName);
		PageInfo<Object> info = new PageInfo(roleList,pageCount);
		return info;
	}


	/**
	 * 根据职位id查询职位信息
	 * @param roleId
	 * @return
	 */
	public RoleBean getRoleByRoleId(int roleId) {
		// TODO Auto-generated method stub
		return roleDao.getRoleByRoleId(roleId);
	}


	/**
	 * 查询该职位下的所有菜单信息
	 * @param roleId
	 * @return
	 */
	public List<MenuBean> getMenuByRoleId(int roleId) {
		// TODO Auto-generated method stub
		return roleDao.getMenuByRoleId(roleId);
	}


	/**
	 * 查询所有职位
	 * @return
	 */
	public List<RoleBean> selectRole() {
		// TODO Auto-generated method stub
		return roleDao.selectRole();
	}


	/**
	 * 删除当前角色之前的权限
	 * 批量插入,赋予权限
	 * @param list
	 * @param roleId
	 * @return
	 */
	public boolean insertManyRoles(List<RoleMenuBean> list,Integer roleId) {
		boolean allis = false;
		boolean isok = roleDao.deleteRoleMenu(roleId);
		boolean is = roleDao.insertManyRoles(list);
		if(is&&isok){
			allis = true;
		}
		return allis;
	}
	
}
