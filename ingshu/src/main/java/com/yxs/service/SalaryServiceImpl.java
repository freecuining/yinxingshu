package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.SalaryBean;
import com.yxs.dao.SalaryDao;

@Service
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	private SalaryDao sd;

	public PageInfo getSalary(int pageNum,int pageSize,int pageCount) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SalaryBean> l = sd.findSalary();
		PageInfo<Object> info = new PageInfo(l,pageCount);
		//
		return info;  
	}

}
