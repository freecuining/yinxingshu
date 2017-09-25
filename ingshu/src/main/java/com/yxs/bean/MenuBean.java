package com.yxs.bean;

import java.io.Serializable;

public class MenuBean implements Serializable {

	private Integer menuId;//菜单id
	private String menuName;//菜单名称
	private Integer parentMenu;//上级菜单
	private String menuUrl;//菜单路径
	private Integer menuState;//菜单状态：是否启用
	private Integer menuDel;//菜单是否被删除
	private String menuRemark;//菜单备注
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Integer getParentMenu() {
		return parentMenu;
	}
	public void setParentMenu(Integer parentMenu) {
		this.parentMenu = parentMenu;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public Integer getMenuState() {
		return menuState;
	}
	public void setMenuState(Integer menuState) {
		this.menuState = menuState;
	}
	public Integer getMenuDel() {
		return menuDel;
	}
	public void setMenuDel(Integer menuDel) {
		this.menuDel = menuDel;
	}
	public String getMenuRemark() {
		return menuRemark;
	}
	public void setMenuRemark(String menuRemark) {
		this.menuRemark = menuRemark;
	}
}
