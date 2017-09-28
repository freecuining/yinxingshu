package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yxs.bean.ResumeBean;
import com.yxs.bean.RoleBean;
import com.yxs.service.ResumeService;
import com.yxs.service.RoleService;
import com.yxs.service.UserService;


@Controller
@RequestMapping("res")
public class ResumeController {
	
	@Autowired
	private ResumeService rss;
	@Autowired
	private RoleService rs;
	
	@Autowired
	private UserService us;
	
	
	/*//查询所有
	@RequestMapping("/eg")
	public String getResume(Model m ,Integer roleId){
		RoleBean role = rs.getRole(roleId);
		m.addAttribute("role", role);
		List<ResumeBean> resumeList=rss.getResume();
		for (ResumeBean resumeBean : resumeList) {
			System.out.println(resumeBean.getRole().get(0).getRoleName());
		}
		m.addAttribute("resumeList", resumeList);
		return "/zhaopin/demo2/list.jsp";
	}*/
	
	//查看简历用户信息
	@RequestMapping("/eg1")
	public String viewResume(Integer resumeId,Model m){
		ResumeBean resume=rss.viewResume(resumeId);
		m.addAttribute("resume", resume);
		return "/zhaopin/demo2/view.jsp";
	}
	

	//预修改查询
	@RequestMapping("/eg2")
	public String pupdateResume(Integer resumeId,Model m){
		ResumeBean resume=rss.viewResume(resumeId);
		m.addAttribute("resume", resume);
		return "/zhaopin/demo2/view.jsp";
	}
	
	//修改
	@RequestMapping("/eg3")
	public  String updateResume(Integer resumeId,Model m){
		ResumeBean resume=rss.updateResume(resumeId);
		m.addAttribute("resume", resume);
		return "/zhaopin/demo2/edit.jsp";
	}
	
	//添加简历信息
	@RequestMapping("/eg4")
	public String addResume(Model m){
	    boolean resuList=rss.addResume();
	    if(resuList){
	    	m.addAttribute("resuList", resuList);
	    	return "/zhaopin/demo2/add.jsp";
	    }
	    return null;
	}
}
