package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.RoleBean;
import com.yxs.bean.UserBean;
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
		for(int i=0;i<roleList.size();i++){
			System.out.println(roleList.get(i).getRoleName());
		}
		PageInfo<Object> info = new PageInfo(roleList,pageCount);
		return info;
	}

}
