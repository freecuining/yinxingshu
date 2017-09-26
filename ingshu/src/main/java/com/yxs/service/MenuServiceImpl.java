package com.yxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxs.bean.MenuBean;
import com.yxs.dao.MenuDao;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	/***
	 * 查询所有菜单
	 * @return
	 */
	public List<MenuBean> getMenu() {
		// TODO Auto-generated method stub
		return menuDao.getMenu();
	}

}
