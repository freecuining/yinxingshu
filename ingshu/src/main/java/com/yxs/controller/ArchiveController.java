package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.ArchiveBean;
import com.yxs.bean.RoleBean;
import com.yxs.service.ArchiveService;
import com.yxs.util.State;

@RequestMapping("/archive")
@Controller
public class ArchiveController {

	@Autowired
	private ArchiveService as;
	
	private PageInfo info;

	@RequestMapping("/list")
	public String getAllArchive(Model m,String pageNum,String name) {
		
		if(pageNum != null){
			
		}else{
			pageNum="1";
		}
		info = as.getAllArchive(pageNum, name);
		m.addAttribute("archl", info.getList());
		m.addAttribute("page", info);
		return "/dangan/demo1/list.jsp";
	}
	
	@RequestMapping("/view")
	public String lookArchive(Model m,int archiveId){
		
		ArchiveBean ab = as.getArchiveById(archiveId);
		m.addAttribute("archb", ab);
		return "/dangan/demo1/view.jsp";
		
		
	}
	
}
