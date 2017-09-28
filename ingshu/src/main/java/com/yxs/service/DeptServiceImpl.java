package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.DeptBean;
import com.yxs.dao.DeptDao;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	/**
	 * 查询所有部门方法实现类
	 * @return
	 */
	public List<DeptBean> getDept() {
		// TODO Auto-generated method stub
		return deptDao.getDept();
	}
	
	/**
	 * 添加一个部门方法
	 * @return
	 */
	public boolean insertDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		return deptDao.insertDept(deptBean);
	}
	
	/**
	 * 获取所有部门的个数
	 * @return
	 */

	public int getDeptCount() {
		// TODO Auto-generated method stub
		return deptDao.getDeptCount();
	}

	public DeptBean getDeptById(int deptId) {
		// TODO Auto-generated method stub
		return deptDao.getDeptById(deptId);
	}

	
	public boolean updateDeptById(DeptBean deptBean) {
		// TODO Auto-generated method stub
		return deptDao.updateDeptById(deptBean);
	}

	
	public boolean queryChildDept(int deptId) {
		// TODO Auto-generated method stub
		int childDept = deptDao.queryChildDept(deptId);
		return childDept>0;
	}

	/**
	 * 获取部门编号最大值
	 * @return
	 */
	
	public String getMaxDeptCode() {
		// TODO Auto-generated method stub
		return deptDao.getMaxDeptCode();
	}

	
	public boolean deleteDeptById(int deptId) {
		// TODO Auto-generated method stub
		return deptDao.deleteDeptById(deptId);
	}

	/**
	 * 查询所有部门信息不包括含有子部门的部门
	 * @return
	 */
	public List<DeptBean> getDeptNotChildDept() {
		// TODO Auto-generated method stub
		return deptDao.getDeptNotChildDept();
	}

}
