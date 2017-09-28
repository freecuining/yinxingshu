package com.yxs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yxs.bean.MenuBean;

@Repository
public interface MenuDao {

	/***
	 * 查询所有菜单
	 * @return
	 */
	public List<MenuBean> getMenu();
	
	/**
	 * 查看单个菜单信息
	 * @param menuId
	 * @return
	 */
	public MenuBean getMenuById(int menuId);
	
	/**
	 * 根据用户id查询当前用户下的所有菜单
	 * @param userId
	 * @return
	 */
	public List<MenuBean> getMenuByUserId(int userId);
}
