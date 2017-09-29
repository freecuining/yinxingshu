package com.yxs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yxs.bean.MenuBean;

public interface MenuService {

	/***
	 * 查询所有菜单
	 * @return
	 */
	public PageInfo getMenuBy(int pageNum,int pageSize,int pageCount, String menuName,int menuState);
	
	
	/**
	 * 根据用户id查询当前用户下的所有菜单
	 * @param userId
	 * @return
	 */
	public List<MenuBean> getMenuByUserId(int userId);
	
	
	/**
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
	 * 添加菜单信息
	 * @param menuBean
	 * @return
	 */
	public boolean insertMenu(MenuBean menuBean);
	
	
	/**
	 * 修改菜单信息
	 * @param menuBean
	 * @return
	 */
	public boolean updateMenuById(MenuBean menuBean);
	
	/**
	 * 删除菜单
	 * @param menuId
	 * @return
	 */
	public boolean deleteMenuById(int menuId);

}
