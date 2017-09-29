package com.yxs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yxs.bean.MenuBean;

@Repository
public interface MenuDao {

	/***
	 * 查询所有菜单模糊查询与分页
	 * @return
	 */
	public List<MenuBean> getMenuBy(@Param("menuName")String menuName, @Param("menuState")int menuState);
	
	
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
	 * 根据用户id查询当前用户下的所有菜单
	 * @param userId
	 * @return
	 */
	public List<MenuBean> getMenuByUserId(int userId);
	
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
