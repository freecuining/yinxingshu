package com.yxs.service;

import java.util.List;

import com.yxs.bean.RoleBean;

public interface RoleService {

	/**
	 * 查询该部门下的所有职位
	 * @param deptId
	 * @return
	 */
	public List<RoleBean> getRoleById(int deptId);
}
