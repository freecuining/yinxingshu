package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.RoleBean;
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

}
