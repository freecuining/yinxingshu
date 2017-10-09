package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.DiplomaBean;
import com.yxs.bean.EducationBean;
import com.yxs.bean.LogBean;
import com.yxs.bean.ResumeBean;
import com.yxs.bean.YearBean;
import com.yxs.dao.LogDao;
import com.yxs.util.State;
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
	 * 
	 * @param year
	 *            哪一年
	 */

	public List<LogBean> getYearChanges(String year) {
		// TODO Auto-generated method stub
		return logd.getYearChanges(year);
	}

	// 查询简历信息
	public PageInfo getFindAll(int pageNum, String user) {
		PageHelper.startPage(pageNum, State.PAGESIZE);
		List<ResumeBean> l = logd.getFindAll(user);
		PageInfo<Object> info = new PageInfo(l, State.PAGECOUNT);
		return info;
	}

	// 查询所有每年学历人数
	public List<EducationBean> getEducation() {
		return logd.getEducation();
	}

	// 查询所有部门学历人数
	public List<YearBean> getYear(String year) {
		return logd.getYear(year);
	}

	public PageInfo getFindAllDil(int pageNum, DiplomaBean db) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, State.PAGESIZE);
		List<DiplomaBean> l = logd.queryAll(db);
		PageInfo<Object> info = new PageInfo(l, State.PAGECOUNT);
		return info;
	}

	

}
