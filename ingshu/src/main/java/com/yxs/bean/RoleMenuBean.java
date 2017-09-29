package com.yxs.bean;

import java.io.Serializable;

public class RoleMenuBean implements Serializable {

	private Integer roleId;
	private Integer menuId;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	
}
