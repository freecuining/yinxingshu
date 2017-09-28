package com.yxs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yxs.bean.DeptBean;
import com.yxs.bean.LogBean;
import com.yxs.service.DeptService;
import com.yxs.service.logService;

@Controller
@RequestMapping("/datamsg")
public class StatisticalController {

	@Autowired
	private logService logs;
	@Autowired
	private DeptService dept;

	@RequestMapping("/changelist")
	public String userChangeList(String year, Model m) {

		List<DeptBean> deptl1 = dept.getDept();
		List<DeptBean> deptl = new ArrayList<DeptBean>();
		for(DeptBean db:deptl1){
		if(db.getParentDept()==0){
			deptl.add(db);
		}
		}
		if (year == null || year == "") {
			List<LogBean> list = logs.getAllChanges();
			List<List<List<LogBean>>> yearlist = new ArrayList<List<List<LogBean>>>();
			List yl = new ArrayList();
			
			for (int y = 2010; y <= 2017; y++) {
				yl.add(y);
				List<List<LogBean>> statelist = new ArrayList<List<LogBean>>();
				for (int i = 0; i <= 4; i++) {

					int count = 0;
					List<LogBean> deptlist = new ArrayList<LogBean>();
					for (int did = 0; did < deptl.size(); did++) {
						LogBean lb = new LogBean();
						lb.setCount(0);
						for (LogBean log : list) {
							if (log.getDeptId() == deptl.get(did).getDeptId()||dept.findParentById(log.getDeptId())==deptl.get(did).getDeptId()) {
								if (log.getLogState() == i) {
									if (log.getYear() == y) {
										
										lb.setDeptId(deptl.get(did).getDeptId());
										lb.setLogState(i);
										lb.setYear(log.getYear());
										lb.setCount(log.getCount());
										
										count = count + log.getCount();
									}
								}
							}
						}
						
						deptlist.add(lb);
						
					}
					LogBean log =new LogBean();
					
					log.setLogState(i);
					log.setCount(count);
					deptlist.add(log);
					statelist.add(deptlist);
					
				}yearlist.add(statelist);
				
			}
			m.addAttribute("ylist",yl);
			m.addAttribute("yearlist",yearlist);
			m.addAttribute("deptl", deptl);
			m.addAttribute("size", deptl.size());
			return "/datamsg/demo3/list.jsp";
		} else {
			List<LogBean> list = logs.getYearChanges(year);

			List<List<List<LogBean>>> monthlist = new ArrayList<List<List<LogBean>>>();
			List ml = new ArrayList();
			for (int y = 1; y <= 12; y++) {
				ml.add(y);
				List<List<LogBean>> statelist = new ArrayList<List<LogBean>>();
				for (int i = 0; i <= 4; i++) {

					int count = 0;
					List<LogBean> deptlist = new ArrayList<LogBean>();
					for (int did = 0; did < deptl.size(); did++) {
						LogBean lb = new LogBean();
						lb.setCount(0);
						for (LogBean log : list) {
							if (log.getDeptId() == deptl.get(did).getDeptId()||dept.findParentById(log.getDeptId())==deptl.get(did).getDeptId()) {
								if (log.getLogState() == i) {
									if (log.getMonth() == y) {
										
										lb.setDeptId(deptl.get(did).getDeptId());
										lb.setLogState(i);
										lb.setMonth(log.getMonth());
										lb.setCount(log.getCount());
										
										count = count + log.getCount();
									}
								}
							}
						}
						
						deptlist.add(lb);
						
					}
					LogBean log =new LogBean();
					
					log.setLogState(i);
					log.setCount(count);
					deptlist.add(log);
					statelist.add(deptlist);
					
				}monthlist.add(statelist);
				
			}
			m.addAttribute("ml", ml);
			m.addAttribute("monthlist",monthlist);
			m.addAttribute("deptl", deptl);
			m.addAttribute("size", deptl.size());
			m.addAttribute("year",year);
			return "/datamsg/demo3/yuelist.jsp";
		}

	}

}
