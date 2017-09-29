package com.yxs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.DeptBean;
import com.yxs.bean.DiplomaBean;
import com.yxs.bean.EducationBean;
import com.yxs.bean.LogBean;
import com.yxs.bean.ResumeBean;
import com.yxs.bean.YearBean;
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
		for (DeptBean db : deptl1) {
			if (db.getParentDept() == 0) {
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
							if (log.getDeptId() == deptl.get(did).getDeptId()
									|| dept.findParentById(log.getDeptId()) == deptl.get(did).getDeptId()) {
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
					LogBean log = new LogBean();

					log.setLogState(i);
					log.setCount(count);
					deptlist.add(log);
					statelist.add(deptlist);

				}
				yearlist.add(statelist);

			}
			m.addAttribute("ylist", yl);
			m.addAttribute("yearlist", yearlist);
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
							if (log.getDeptId() == deptl.get(did).getDeptId()
									|| dept.findParentById(log.getDeptId()) == deptl.get(did).getDeptId()) {
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
					LogBean log = new LogBean();

					log.setLogState(i);
					log.setCount(count);
					deptlist.add(log);
					statelist.add(deptlist);

				}
				monthlist.add(statelist);

			}
			m.addAttribute("ml", ml);
			m.addAttribute("monthlist", monthlist);
			m.addAttribute("deptl", deptl);
			m.addAttribute("size", deptl.size());
			m.addAttribute("year", year);
			return "/datamsg/demo3/yuelist.jsp";
		}

	}

	@RequestMapping("/chuben")
	public String getquetyAll(Model m, ResumeBean rb, @RequestParam(value = "pageNum", required = false) int pageNum,
			HttpServletRequest request, @RequestParam(value = "flag", required = false) String query) {
		if (pageNum <= 0) {
			pageNum = 1;
		}
		if ("query".equals(query)) {
			request.getSession().removeAttribute("rb");
		}
		PageInfo info = logs.getFindAll(pageNum, rb.getName());
		List<ResumeBean> l = info.getList();
		m.addAttribute("rb", rb);
		m.addAttribute("l", l);
		m.addAttribute("page", info);
		return "/datamsg/demo4/list.jsp";
	}

	@RequestMapping("/dilopma")
	public String queryAll(@RequestParam(value = "pageNum", required = false) String pn, Model m, DiplomaBean db,
			@RequestParam(value = "query", required = false) String query, HttpServletRequest request) {
		int pageNum = 1;
		if (pn == null || pn == "") {
		} else {
			pageNum = Integer.parseInt(pn);
		}
		if ("query".equals(query)) {
			request.getSession().removeAttribute("db");
		}
		PageInfo info = logs.getFindAllDil(pageNum, db);
		List<DiplomaBean> list = info.getList();
		List<DeptBean> l = dept.getDept();
		m.addAttribute("db", db);
		m.addAttribute("l", l);
		m.addAttribute("list", list);
		m.addAttribute("page", info);
		return "/datamsg/demo1/list.jsp";
	}

	@RequestMapping("/education")
	public String geteducation(Model m) {
		List<EducationBean> l = logs.getEducation();
		m.addAttribute("l", l);
		return "/datamsg/demo2/list.jsp";
	}

	@RequestMapping("/year")
	public String getyear(Model m, String year) {

		if (year != null && year != "") {
			List<YearBean> l = logs.getYear(year);

			List<DeptBean> deptl = dept.getDept();
			m.addAttribute("l", l);
			m.addAttribute("deptl", deptl);
			return "/datamsg/demo2/zilist.jsp";
		} else {
			return null;
		}

	}

}
