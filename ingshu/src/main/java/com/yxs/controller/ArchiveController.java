package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yxs.bean.ArchiveBean;

import com.yxs.service.ArchiveService;

@RequestMapping("/ac")
@Controller
public class ArchiveController {

	@Autowired
	private ArchiveService as;

	@RequestMapping("/viewarchive")
	public String getAllArchive(Model m) {
		List<ArchiveBean> l = as.getAllArchive();
	    m.addAttribute("l", l);
		return "/dangan/demo1/list.jsp";
	}
	
	@RequestMapping("/view")
	public String getKanArchive(Model m,Integer archiveId){
	    ArchiveBean an=as.getKanArchive(archiveId);
	    m.addAttribute("an",an);
	    return "/dangan/demo1/view.jsp";
	}
	
	@RequestMapping("/pupdate")
	public String getUpdate(Model m,Integer archiveId){
		ArchiveBean an=as.getKanArchive(archiveId);
	    m.addAttribute("an",an);
	    return "/dangan/demo1/biangeng.jsp";
	}
	
}
