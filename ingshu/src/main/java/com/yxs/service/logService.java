package com.yxs.service;

import java.util.ArrayList;
import java.util.List;

import com.yxs.bean.LogBean;

public interface logService {

	
	public List<LogBean> getAllChanges();
	
	public List<LogBean> getYearChanges(String year);
}
