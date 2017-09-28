package com.yxs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	
	
	/**
	 * 查询所有职位信息
	 */
	public List<RoleBean> getRole(@Param("roleName")String roleName, @Param("deptName")String deptName);
}
