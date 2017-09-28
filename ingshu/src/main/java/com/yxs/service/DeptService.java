package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.DeptBean;
import com.yxs.bean.SalaryBean;

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
	
	/**
	 * 修改部门信息
	 */
	public boolean updateDeptById(DeptBean deptBean);
	
	/**
	 * 查询子部门信息，用来判断当前部门下是否有子部门
	 * @return
	 */
	public boolean queryChildDept(int deptId);
	
	
	/**
	 * 获取部门编号最大值
	 * @return
	 */
	public String getMaxDeptCode();
	
	/**
	 * 删除部门
	 * @return
	 */
	public boolean deleteDeptById(int deptId);
	/**
	 * 查询部门的父部门
	 * @return
	 */
	public int findParentById(int deptId);
	
	/**
	 * 查询所有部门信息不包括含有子部门的部门
	 * @return
	 */
	public List<DeptBean> getDeptNotChildDept();
	
}
