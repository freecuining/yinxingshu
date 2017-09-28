package com.yxs.service;

import java.util.List;

import com.yxs.bean.MenuBean;

public interface MenuService {

	/***
	 * 查询所有菜单
	 * @return
	 */
	public List<MenuBean> getMenu();
	
	
	/**
	 * 根据用户id查询当前用户下的所有菜单
	 * @param userId
	 * @return
	 */
	public List<MenuBean> getMenuByUserId(int userId);
}
