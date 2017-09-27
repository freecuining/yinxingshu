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
	/**
	 * 展现
	 * @param request
	 * @param m
	 * @return
	 */
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
	/**
	 * 预添加
	 * 添加方法中页面先获得编号的ID
	 * 
	 */
	@RequestMapping("/codeId")
	public String codeId(Model m){
		int code = ss.findCode();
		m.addAttribute("salaryCode", code);
		return "/pay/standardAdd.jsp";
	}
	
	
	/**
	 * 添加的方法
	 * @param sb
	 * @param request
	 * @param m
	 * @return
	 */
	@RequestMapping("/addSalary")
	public String addSalary(SalaryBean sb,HttpServletRequest request,Model m){
		sb.setSalaryDel(State.UNDELETE);
		sb.setSalarySate(State.DRAFT);
		boolean insertSalary = ss.insertSalary(sb);
		if(insertSalary){
			
			return list(request, m);
		}else{
			return "/bb/codeId";
		}
	}

}
