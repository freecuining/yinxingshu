package com.yxs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yxs.bean.RoleBean;

@Repository
public interface RoleDao {

	/**
	 * 查询该部门下的所有职位
	 * @param deptId
	 * @return
	 */
	public List<RoleBean> getRoleById(int deptId);
}
