package com.yxs.controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.SalaryBean;
import com.yxs.service.SalaryService;
import com.yxs.util.State;
@Controller
@RequestMapping("/bb")
public class SalaryController {
	@Autowired
	private SalaryService ss;
	@RequestMapping("/salary")
	public String list(HttpServletRequest request,Model m){
		int pageNum=1;//起始页
		String pn = request.getParameter("pageNum");
		if(pn != null){
			pageNum = Integer.parseInt(pn);
		}
		
		PageInfo info = ss.getSalary(pageNum, State.PAGESIZE, State.PAGECOUNT);
		//info.getNavigatepageNums();  页面显示12345   ..678910..  格式
		//info.getTotal();
		List<SalaryBean> l = info.getList();
		m.addAttribute("salaryList",l);
		m.addAttribute("page", info);
		return "/pay/standard.jsp";
	}

}
