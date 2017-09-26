package com.yxs.dao;

import java.util.List;

import com.yxs.bean.SalaryBean;

public interface SalaryDao {
	/**
	 * 查询工资表信息
	 * @return
	 */
	public List<SalaryBean> findSalary();

}
