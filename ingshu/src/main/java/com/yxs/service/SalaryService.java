package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.SalaryBean;

public interface SalaryService {
	/**
	 * 查询工资表信息
	 * @return
	 */
	public PageInfo getSalary(int pageNum,int pageSize,int pageCount);

}
