package com.yxs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yxs.bean.LogBean;

public interface LogDao {
	
	public List<LogBean> getAllChanges();

	public List<LogBean> getYearChanges(@Param("year") String year);
}
