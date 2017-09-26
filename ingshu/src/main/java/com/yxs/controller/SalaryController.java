package com.yxs.controller;

import java.util.List;

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
	public String list(int pageNum,Model m){
		PageInfo info = ss.findSalary(pageNum, State.PAGESIZE, State.PAGECOUNT);
		List<SalaryBean> l = info.getList();
		m.addAttribute("salaryList",l);
		m.addAttribute("page", info);
		return "/pay/standard.jsp";
	}

}
