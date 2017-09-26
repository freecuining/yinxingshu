package com.yxs.bean;

import java.io.Serializable;

public class RoleBean implements Serializable {

	private Integer roleId;//角色id
	private Integer deptId;//部门id
	private String roleCode;//角色编号
	private String roleName;//角色姓名
	private String roleKind;//角色分类
	private String startTime;//起始时间
	private String endTime;//结束时间
	private String roleIntro;//角色描述
	private String roleRequired;//
	private Integer roleState;//启用与停用
	private Integer roleDel;//是否删除
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleKind() {
		return roleKind;
	}
	public void setRoleKind(String roleKind) {
		this.roleKind = roleKind;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getRoleIntro() {
		return roleIntro;
	}
	public void setRoleIntro(String roleIntro) {
		this.roleIntro = roleIntro;
	}
	public String getRoleRequired() {
		return roleRequired;
	}
	public void setRoleRequired(String roleRequired) {
		this.roleRequired = roleRequired;
	}
	public Integer getRoleState() {
		return roleState;
	}
	public void setRoleState(Integer roleState) {
		this.roleState = roleState;
	}
	public Integer getRoleDel() {
		return roleDel;
	}
	public void setRoleDel(Integer roleDel) {
		this.roleDel = roleDel;
	}
	
	
}
