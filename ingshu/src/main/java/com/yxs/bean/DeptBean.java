package com.yxs.bean;

import java.io.Serializable;

public class DeptBean implements Serializable {

	private Integer deptId;// 部门id
	private String deptCode;// 部门编号
	private String deptShortName;// 部门简称
	private String deptName;// 部门全称
	private Integer parentDept;// 上级部门
	private String deptAddress;// 部门地址
	private String deptIntro;// 部门描述
	private String deptRemark;// 部门备注
	private Integer deptState;// 是否启用1：启用；0：未启用
	private String deptDel;// 是否删除
	private String deptUrl;//部门的url地址

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptShortName() {
		return deptShortName;
	}

	public void setDeptShortName(String deptShortName) {
		this.deptShortName = deptShortName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getParentDept() {
		return parentDept;
	}

	public void setParentDept(Integer parentDept) {
		this.parentDept = parentDept;
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	public String getDeptIntro() {
		return deptIntro;
	}

	public void setDeptIntro(String deptIntro) {
		this.deptIntro = deptIntro;
	}

	public String getDeptRemark() {
		return deptRemark;
	}

	public void setDeptRemark(String deptRemark) {
		this.deptRemark = deptRemark;
	}

	public Integer getDeptState() {
		return deptState;
	}

	public void setDeptState(Integer deptState) {
		this.deptState = deptState;
	}

	public String getDeptDel() {
		return deptDel;
	}

	public void setDeptDel(String deptDel) {
		this.deptDel = deptDel;
	}

	public String getDeptUrl() {
		return deptUrl;
	}

	public void setDeptUrl(String deptUrl) {
		this.deptUrl = deptUrl;
	}
	

}
