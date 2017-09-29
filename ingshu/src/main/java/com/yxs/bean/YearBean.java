package com.yxs.bean;

import java.io.Serializable;

public class YearBean implements Serializable{
	private int yearId;
	private int deptId;
	private int educationId;
	private String loarned;
	private String master;
	private String regular;
	private String junior;
	private String amount;
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getYearId() {
		return yearId;
	}
	public void setYearId(int yearId) {
		this.yearId = yearId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public String getLoarned() {
		return loarned;
	}
	public void setLoarned(String loarned) {
		this.loarned = loarned;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getRegular() {
		return regular;
	}
	public void setRegular(String regular) {
		this.regular = regular;
	}
	public String getJunior() {
		return junior;
	}
	public void setJunior(String junior) {
		this.junior = junior;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public YearBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
