package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.bean.MenuBean;
import com.yxs.bean.RoleBean;
import com.yxs.dao.MenuDao;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	/***
	 * 查询所有菜单
	 * @return
	 */
	public PageInfo getMenuBy(int pageNum, int pageSize, int pageCount, String menuName, int menuState) {
		PageHelper.startPage(pageNum, pageSize);
		List<MenuBean> menuList = menuDao.getMenuBy(menuName,menuState);
		PageInfo<Object> info = new PageInfo(menuList,pageCount);
		return info;
	}
	
	
	/**
	 * 根据用户id查询当前用户下的所有菜单
	 * @param userId
	 * @return
	 */
	public List<MenuBean> getMenuByUserId(int userId) {
		// TODO Auto-generated method stub
		return menuDao.getMenuByUserId(userId);
	}

	/**
	 * 查询所有菜单
	 * @return
	 */
	public List<MenuBean> getMenu(){
		return menuDao.getMenu();
	}



	/**
	 * 查看单个菜单信息
	 * @param menuId
	 * @return
	 */
	public MenuBean getMenuById(int menuId) {
		// TODO Auto-generated method stub
		return menuDao.getMenuById(menuId);
	}

	/**
	 * 添加菜单信息
	 * @param menuBean
	 * @return
	 */
	public boolean insertMenu(MenuBean menuBean) {
		// TODO Auto-generated method stub
		return menuDao.insertMenu(menuBean);
	}

	/**
	 * 修改菜单信息
	 * @param menuBean
	 * @return
	 */
	public boolean updateMenuById(MenuBean menuBean) {
		// TODO Auto-generated method stub
		return menuDao.updateMenuById(menuBean);
	}

	/**
	 * 删除菜单
	 * @param menuId
	 * @return
	 */
	public boolean deleteMenuById(int menuId) {
		// TODO Auto-generated method stub
		return menuDao.deleteMenuById(menuId);
	}
}
