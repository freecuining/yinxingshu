package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.RoleBean;
import com.yxs.dao.RoleDao2;

@Service
public class RoleServiceImpl2 implements RoleService2 {

	@Autowired
	private RoleDao2 rd;
	
	public PageInfo getRoles(int pageNum,int pageSize,int num) {
		// TODO Auto-generated method stub
		
		List<RoleBean> l = null;
		PageInfo<Object> info = null;
		PageHelper.startPage(pageNum, pageSize);
		l=rd.getRoles();
		info=new PageInfo(l,num);
		int c = info.getPages();
		if(pageNum > c){
			PageHelper.startPage(c, 

pageSize);
			l = rd.getRoles();
			info = new PageInfo(l,num);
		}
		return info;
	}
    //根据用户id得到roleid
	public int getRoleId(int userId) {
		// TODO Auto-generated method stub
		return rd.getRoleId(userId);
	}

	

	// 查看职位信息
	public RoleBean getRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.getRole(roleId);
	}

	// 查看变更信息(预修改)
	public RoleBean pupdateRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.pupdateRole(roleId);
	}

	//修改职位发布信息
	public boolean updateRole(Integer roleId, String

	roleNum, String roleRemark, String roleRequired) {
		// TODO Auto-generated method stub
		return rd.updateRole

		(roleId, roleNum, roleRemark, roleRequired);
	}

	
	/*//预添加
	@Override
	public List<RoleBean> paddRole() {
		// TODO Auto-generated method stub
		return rd.paddRole();
	}*/
	
	
	//添加职位信息
	public boolean addRole(RoleBean role) {
		// TODO Auto-generated method stub
		return rd.addRole(role);
	}


	//删除职位
	public boolean deleteRole(Integer roleId) {
		// TODO Auto-generated method stub
		return rd.deleteRole(roleId);
	}
	public List<RoleBean> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}
}
