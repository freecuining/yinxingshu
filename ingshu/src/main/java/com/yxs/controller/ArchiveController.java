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
		m.addAttribute("an", ab);
		return "/dangan/demo1/view.jsp";
		
		
	}
	
	
	/**
	 * 变更前的查询
	 * 
	 **/
	@RequestMapping("/pupdate")
	public String getUpdateBefore(Model m,Integer archiveId){
		ArchiveBean ar=as.getPupdate(archiveId);
	    m.addAttribute("ar",ar);
	    return "/dangan/demo1/biangeng.jsp";
	}
	/**
	 * 
	 * 实现变更
	 * 
	 */
	@RequestMapping("/update")
	public String getUpdateArchiven(Model m,ArchiveBean archiveBean){
		Boolean is=true;
		 is=as.getUpdateArchiven(archiveBean);
		 if(is){
			 return "/ac/viewarchive";
		 }else{
			 return "/ac/pupdate";
		 }
	}
	
	@RequestMapping("/delete")
	public String getDeleteArchive(Integer archiveId){
		boolean is=as.getDeleteArchive(archiveId);
		if(is){
			return "/ac/viewarchive";	
		}else{
			return "/ac/viewarchive";
		}
		
	 }
	
	@RequestMapping("/add")
	public String getAddArchive(String archiveCode){
	
		
		boolean is=as.getAddArchive(archiveCode);
		if(is){
			return "/ac/viewarchive";
		}else{
			return "/dangan/demo1/add.jsp";
		}
		
	}
	
}
