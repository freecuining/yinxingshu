package com.yxs.service;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.RoleBean;

public interface RoleService2 {

	// 展现职位发布
	public PageInfo getRoles(int nowPage,int pageSize,int num);
    //根据用户id得到roleid
	public int getRoleId(int userId);

	// 查看职位信息
	public RoleBean getRole(Integer

	roleId);

	// 查看变更的信息(预修改)
	public RoleBean pupdateRole(Integer

	roleId);

	// 变更职位
	public boolean updateRole(Integer

	roleId, String roleNum, String roleRemark, String

	roleRequired);

	/*//预添加
	public List<RoleBean> paddRole();*/
	
	
	//添加职员发布数据
	public boolean addRole(RoleBean role);
	
	//删除职位
	public boolean deleteRole(Integer roleId);
}
