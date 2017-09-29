package com.yxs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yxs.bean.ResumeBean;

@Repository
public interface ResumeDao {
	
	
	//展现简历列表
	public List<ResumeBean> getResume();

	
	//查看简历用户信息
	public ResumeBean viewResume(Integer resumeId);
	
	
	//预修改查询
	public ResumeBean pupdateResume(Integer resumeId);
	
	
	//修改
	public ResumeBean updateResume(Integer resumeId);
	
	//添加简历用户
	public boolean addResume();   
	
}
