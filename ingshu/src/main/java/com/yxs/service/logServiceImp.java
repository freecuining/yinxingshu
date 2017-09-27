package com.yxs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.DeptBean;
import com.yxs.bean.LogBean;
import com.yxs.dao.DeptDao;
import com.yxs.dao.LogDao;

@Service

public class logServiceImp implements logService {

	@Autowired
	private LogDao logd;
	
	private DeptDao dept;

	public List<ArrayList> getAllChanges(int year,int month) {
		// TODO Auto-generated method stub
		
		List<LogBean> list = logd.getAllChanges();
		List<DeptBean> deptl = dept.getDept();
		List<ArrayList> l = new LinkedList<ArrayList>();

		for (LogBean lb : list) {
			int[] a = new int[5 * deptl.size()];
			for (int k = 0; k < 4; k++) {
				if (lb.getLogState() == k) {
					for (DeptBean dept : deptl) {
						if (lb.getDeptId() == dept.getDeptId()) {
							for (int years = 2010; years < ((new Date()).getYear()); years++) {
								for (int months = 1; months < ((new Date()).getMonth()); months++)

									for (int j : a) {

									}
							}

						}

					}
				}
			}
		}
		return l;
		
	}
	
	
}
