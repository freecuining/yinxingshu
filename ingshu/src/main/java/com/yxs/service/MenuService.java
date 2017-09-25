package com.yxs.service;

import java.util.List;

import com.yxs.bean.MenuBean;

public interface MenuService {

	/***
	 * 查询所有菜单
	 * @return
	 */
	public List<MenuBean> getMenu();
}
