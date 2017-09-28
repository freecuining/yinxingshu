package com.yxs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yxs.bean.RoleBean;


@Repository
public interface RoleDao2 {

	// 展现职位发布
	public List<RoleBean> getRoles();
	//根据用户id得到roleid
	public int getRoleId(int userId);


	// 查看职位信息
	public RoleBean getRole(Integer roleId);

	// 查看变更的信息(预修改)
	public RoleBean pupdateRole(Integer roleId);

	// 变更职位
	public boolean updateRole(@Param("roleId") Integer roleId, @Param("roleNum") String

	roleNum, @Param("roleRemark") String roleRemark, @Param("roleRequired") String roleRequired);

	//预添加
	public List<RoleBean> paddRole();
	
	//添加职员发布数据
	public boolean addRole(RoleBean role);
	
	//删除职位
	public boolean deleteRole(Integer roleId);
}

