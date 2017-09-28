package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.LogBean;
import com.yxs.dao.LogDao;

@Service

public class logServiceImp implements logService {

	@Autowired
	private LogDao logd;

	public List<LogBean> getAllChanges() {
		// TODO Auto-generated method stub
		
		return logd.getAllChanges();
		
	}

	public List<LogBean> getYearChanges(String year) {
		// TODO Auto-generated method stub
		return logd.getYearChanges(year);
	}
	
	
}
