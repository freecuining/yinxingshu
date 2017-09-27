package com.yxs.bean;

import java.io.Serializable;
import java.sql.Date;

public class LogBean implements Serializable{
	
	private int logId;//记录Id
	private int ArchiveId;//档案Id
	private int logState;//更改状态
	private Date changeTime;//更改时间
	private String logRemark;//记录描述
	private int deptId;//部门Id
	public int getArchiveId() {
		return ArchiveId;
	}
	public void setArchiveId(int archiveId) {
		ArchiveId = archiveId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
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
