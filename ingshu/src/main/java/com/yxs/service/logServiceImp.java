package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.LogBean;

import com.yxs.dao.LogDao;

import com.yxs.dao.DeptDao;



@Service
public class logServiceImp implements logService {


	@Autowired
	private LogDao logd;

	/**
	 * 查询各年各部门的人员变更
	 */
	public List<LogBean> getAllChanges() {

		return logd.getAllChanges();
		

	}
	/**
	 * 查询当年各月各部门的人员变更
	 * @param year 哪一年
	 */

	public List<LogBean> getYearChanges(String year) {
		// TODO Auto-generated method stub
		return logd.getYearChanges(year);
	}
	

	
}
