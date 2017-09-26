package com.yxs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yxs.bean.SalaryBean;

@Repository
public interface SalaryDao {
	/**
	 * 查询工资表信息
	 * @return
	 */
	public List<SalaryBean> findSalary();

}
