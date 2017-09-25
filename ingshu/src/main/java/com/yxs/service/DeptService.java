package com.yxs.service;

import java.util.List;

import com.yxs.bean.DeptBean;

public interface DeptService {

	/**
	 * 查询所有部门方法
	 * @return
	 */
	public List<DeptBean> getDept();
	
	/**
	 * 查询未被删除并且启用状态所有部门方法
	 * @return
	 */
	public DeptBean getDeptById(int deptId);
	
	/**
	 * 添加一个部门
	 * @param deptBean
	 * @return
	 */
	public boolean insertDept(DeptBean deptBean);
	
	/**
	 * 获取所有部门的个数
	 * @return
	 */
	public int getDeptCount();
}
