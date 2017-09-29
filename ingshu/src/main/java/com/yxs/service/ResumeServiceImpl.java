package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.ResumeBean;
import com.yxs.dao.ResumeDao;


@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private ResumeDao rsd;

	public List<ResumeBean> getResume() {
		// TODO Auto-generated method stub
		return rsd.getResume();
	}
	//查看简历用户信息
	public ResumeBean viewResume(Integer resumeId) {
		// TODO Auto-generated method stub
		return rsd.viewResume(resumeId);
	}
	
	//预修改
	public ResumeBean pupdateResuem(Integer resumeId) {
		// TODO Auto-generated method stub
		return rsd.pupdateResume(resumeId);
	}

	
	//修改
	public ResumeBean updateResume(Integer resumeId) {
		// TODO Auto-generated method stub
		return rsd.updateResume(resumeId);
		
	}
	
	//添加
	public boolean addResume() {
		// TODO Auto-generated method stub
		return rsd.addResume();
	}
	
	
	
}
