package com.yxs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yxs.bean.MenuBean;
import com.yxs.service.MenuService;
import com.yxs.util.State;

@Controller
@RequestMapping("/cn")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/lookMenu")
	public String getMenuById(Integer menuId,Model m){
		MenuBean menuBean = menuService.getMenuById(menuId);
		List<MenuBean> menuList = menuService.getMenu();
		m.addAttribute("menuList", menuList);
		m.addAttribute("menuBean", menuBean);
		return "/resource/demo8/view.jsp";
	}
	/**
	 * 添加菜单之前的准备工作
	 * @param m
	 * @return
	 */
	@RequestMapping("/pinsertMenu")
	public String pinsertMenu(Model m){
		List<MenuBean> menuList = menuService.getMenu();
		List<MenuBean> menuListTwo = new ArrayList<MenuBean>();
		for(int i=0;i<menuList.size();i++){
			MenuBean menuBean1 = menuList.get(i);
			if(menuBean1.getParentMenu()==0){
				menuListTwo.add(menuBean1);
			}
		}
		m.addAttribute("menuListTwo", menuListTwo);
		return "/resource/demo8/add.jsp";
	}
	
	/**
	 * 添加菜单
	 * @param menuBean
	 * @param m
	 * @return
	 */
	@RequestMapping("/insertMenu")
	public String insertMenu(MenuBean menuBean,Model m){
		menuBean.setMenuDel(State.UNDELETE);
		boolean is = menuService.insertMenu(menuBean);
		if(is){
			return "/cn/viewMenu";
		}else{
			return "/cn/pinsertMenu";
		}
	}
	
	/**
	 * 预修改菜单信息
	 * @param menuBean
	 * @param m
	 * @return
	 */
	@RequestMapping("/pupdateMenu")
	public String pupdateMenu(Integer menuId,Model m){
		MenuBean menuBean = menuService.getMenuById(menuId);
		List<MenuBean> menuList = menuService.getMenu();
		m.addAttribute("menuList", menuList);
		m.addAttribute("menuBean", menuBean);
		return "/resource/demo8/edit.jsp";
	}
	
	
	/**
	 * 修改菜单
	 * @param menuBean
	 * @param m
	 * @return
	 */
	@RequestMapping("/updateMenu")
	public String updateMenu(MenuBean menuBean,Model m){
		boolean is = menuService.updateMenuById(menuBean);
		if(is){
			return "/cn/viewMenu";
		}else{
			return "/cn/pupdateMenu";
		}
	}
	
	/**
	 * 删除菜单信息
	 * @param menuId
	 * @param m
	 * @return
	 */
	@RequestMapping("/deleteMenu")
	public String deleteMenu(Integer menuId,Model m){
		boolean is = menuService.deleteMenuById(menuId);
		if(is){
			return "/cn/viewMenu";
		}else{
			return "/cn/viewMenu";
		}
	}
}
