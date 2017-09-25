package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxs.bean.TrainBean;
import com.yxs.service.TrainService;

@Controller
@RequestMapping("Ain")
public class TrainController {
  //由添加页面跳转过来再讲添加的数据传到主页面数据上
	@Autowired
	private TrainService trainService;
	@RequestMapping("insertAin.do")
 public ModelAndView insertAin(@ModelAttribute TrainBean ain){
		trainService.insertAin(ain);
		return this.queryAinAll(1);
	}
	//查询   培训计划页面  所有   并且带有分页
	@RequestMapping("queryAinAll.do")
	private ModelAndView queryAinAll(@RequestParam(defaultValue = "1")Integer nowPage){
		// TODO Auto-generated method stub
		//分页
		Integer  pageSize = 5;
		//为true代表有总条数的统计
		Page page = PageHelper.startPage(nowPage,pageSize,true);
		
		List<TrainBean> beans = trainService.queryAinAll();
		//总体条数
		Integer totalCount = Integer.parseInt(page.getTotal()+"");
		Integer totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
		ModelAndView modelAndView = new ModelAndView("/peixun/peixunjihua/list.jsp");
		modelAndView.addObject("beans",beans);
		modelAndView.addObject("nowPage",nowPage);
		modelAndView.addObject("totalPage",totalPage);
		modelAndView.addObject("totalCount",totalPage);
		return modelAndView;
	}
	
}
