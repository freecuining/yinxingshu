package com.yxs.service;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.DiplomaBean;
import com.yxs.bean.EducationBean;
import com.yxs.bean.LogBean;
import com.yxs.bean.YearBean;

public interface logService {

	public List<LogBean> getAllChanges();

	public List<LogBean> getYearChanges(String year);

	// 查询简历信息
	public PageInfo getFindAll(int nowPage, String user);

	// 查询所有每年学历人数
	public List<EducationBean> getEducation();

	// 查询所有部门学历人数
	public List<YearBean> getYear(String year);

	public PageInfo getFindAllDil(int pageNum,  DiplomaBean db);
}
