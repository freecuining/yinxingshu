package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.RoleBean;

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
	
}
