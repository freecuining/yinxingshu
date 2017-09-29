package com.yxs.bean;

import java.io.Serializable;

public class EducationBean implements Serializable {
	private int educationId;//学历Id
	private String learned;//博士
	private String master;//硕士
	private String regular;//本科
	private String junior;//专科
	private String time;//时间
	private String amount;//总计
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public String getLearned() {
		return learned;
	}
	public void setLearned(String learned) {
		this.learned = learned;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	public EducationBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
