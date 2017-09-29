package com.yxs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yxs.bean.DiplomaBean;
import com.yxs.bean.EducationBean;
import com.yxs.bean.LogBean;
import com.yxs.bean.ResumeBean;
import com.yxs.bean.YearBean;

public interface LogDao {

	
	public List<LogBean> getAllChanges();

	public List<LogBean> getYearChanges(@Param("year") String year);
	
	public boolean  insertLog(LogBean log);

	// 查询简历信息
	public List<ResumeBean> getFindAll(@Param("userName") String userName);

	// 查询所有每年学历人数
	public List<EducationBean> getEducation();

	// 查询所有部门学历人数
	public List<YearBean> getYear(String year);

	public List<DiplomaBean> queryAll(DiplomaBean db);
}
