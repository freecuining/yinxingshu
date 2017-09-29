package com.yxs.bean;

import java.io.Serializable;

public class RoleBean implements Serializable {

	private Integer roleId;//角色id
	private Integer deptId;//部门id
	private String deptName;//部门名称
	private String roleCode;//角色编号
	private String roleName;//角色姓名
	private Integer roleKind;//角色分类
	private String startTime;//起始时间
	private String endTime;//结束时间
	private String roleIntro;//角色描述
	private String roleRemark;//角色备注
	private String roleRequired;//
	private Integer roleState;//启用与停用
	private Integer roleDel;//是否删除
	private Integer ROLE_RECRITTYPE;
	private Integer roleNum;
	private DeptBean dept;
	
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
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
	
	public Integer getRoleKind() {
		return roleKind;
	}
	public void setRoleKind(Integer roleKind) {
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
	public String getRoleRemark() {
		return roleRemark;
	}
	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}
	public Integer getROLE_RECRITTYPE() {
		return ROLE_RECRITTYPE;
	}
	public void setROLE_RECRITTYPE(Integer rOLE_RECRITTYPE) {
		ROLE_RECRITTYPE = rOLE_RECRITTYPE;
	}
	public Integer getRoleNum() {
		return roleNum;
	}
	public void setRoleNum(Integer roleNum) {
		this.roleNum = roleNum;
	}
	public DeptBean getDept() {
		return dept;
	}
	public void setDept(DeptBean dept) {
		this.dept = dept;
	}
	
}
