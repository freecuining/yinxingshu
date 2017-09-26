package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.SalaryBean;
import com.yxs.dao.SalaryDao;

public class SalaryServiceImpl implements SalaryService {
	private SalaryDao sd;

	public PageInfo findSalary(int pageNum,int pageSize,int pageCount) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SalaryBean> l = sd.findSalary();
		PageInfo<Object> info = new PageInfo(l,pageCount);
		//
		return info;  
	}

}
