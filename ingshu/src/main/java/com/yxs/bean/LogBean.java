package com.yxs.bean;

import java.io.Serializable;
import java.sql.Date;

public class LogBean implements Serializable{
	
	private int logId;
	private int userId;
	private int logState;
	private Date changeTime;
	private String logRemark;
	
	public LogBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getLogState() {
		return logState;
	}
	public void setLogState(int logState) {
		this.logState = logState;
	}
	public Date getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	public String getLogRemark() {
		return logRemark;
	}
	public void setLogRemark(String logRemark) {
		this.logRemark = logRemark;
	}
	


}
