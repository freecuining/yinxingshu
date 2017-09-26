package com.yxs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@RequestMapping("/insertAin")
 public ModelAndView insertAin(@ModelAttribute TrainBean ain){
		trainService.insertAin(ain);
		return this.queryAinAll(1);
	}
	@RequestMapping("/deleteAin")
	public  ModelAndView deleteAin(int traId,Model model){
		trainService.deleteAin(traId);
		return this.queryAinAll(1);
	}
	//预修改，从主页过来后获得id， 然后到修改页面
	@RequestMapping("/preUpdateAin")
	public String preUpdateAin(int traId,Model model){
		TrainBean train = trainService.queryAinById(traId);
		model.addAttribute("train",train);
		return "/peixun/peixunjihua/edit.jsp";
	}
	//培训反馈跳转到反馈页面
	@RequestMapping("/traResult")
	public String traResult(int traId,Model model){
	  TrainBean train = trainService.queryAinById(traId);
	  model.addAttribute("train",train);
	  return "/peixun/peixunfankui/fankui.jsp ";
	}
	//修改后的数据经过控制层传到主页面
	@RequestMapping("/updateAin")
	public ModelAndView updateAin(@ModelAttribute  TrainBean ain){
		trainService.updateAin(ain);
		return this.queryAinAll(1);
	}
	//模块二 的培训复核使状态值变成起草
	@RequestMapping("/updateAin1")
	public ModelAndView updateMon1(int traId){
		TrainBean train = trainService.queryAinById(traId);
		  train.setTraState(1);//审核中
		  
		  trainService.updateAin(train);
		  return this.queryAinAll(1);
}
	//模块二的培训复核状态值变成起草
	@RequestMapping("/updateAin2")
	public ModelAndView updateMon2(int tbId) {
		TrainBean train = trainService.queryAinById(tbId);
		train.setTraState(2);//起草
		trainService.updateAin(train);
		return this.queryAinAll(1);
}
	//模块二中的培训复核状态值变成审核通过
	@RequestMapping("updateAin3.do")
	public ModelAndView updateMon3(int tbId) {
		TrainBean train = trainService.queryAinById(tbId);
		train.setTraState(1);//审核通过
		trainService.updateAin(train);
		return this.queryAinAll(1);
		}
    @RequestMapping("queryAinById.do")
	public String queryMonById(@ModelAttribute int tbId) {
		trainService.queryAinById(tbId);
		return "/datamsg/demo/preUpdate.jsp";
	}
	//查询   培训计划页面  所有   并且带有分页
	@RequestMapping("/queryAinAll")
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
	//查询状态为审核中
	@RequestMapping("/queryAinTraState")
	
	public ModelAndView queryAinTraState (@RequestParam(defaultValue = "1")Integer nowPage){
		//分页
		Integer pageSize = 5 ;
		//为true代表有总条数的统计
		Page page = PageHelper.startPage(nowPage,pageSize,true);
		List<TrainBean> beans = trainService.queryAinTraState();
		Integer totalCount = Integer.parseInt(page.getTotal() + "");//总条数
		Integer totalPage = totalCount % pageSize == 0 ? totalCount  / pageSize :totalCount / pageSize + 1 ;
		ModelAndView modelAndView = new ModelAndView ("/peixun/peixunfuhe/list.jsp");
	    modelAndView.addObject("beans",beans);
	    modelAndView.addObject("nowPage",nowPage);
	    modelAndView.addObject("totalPage",totalPage);
	    modelAndView.addObject("totalCount",totalCount);
		return modelAndView;
	}
	//查询状态为审核通过的
	@RequestMapping("/queryAinTraResult")
	public ModelAndView queryAinTraResult(@RequestParam(defaultValue = "1") Integer nowPage){
		Integer pageSize = 5 ;
		//为true 代表的有总条数的统计
		Page page = PageHelper.startPage(nowPage,pageSize,true);
		List<TrainBean>  beans = trainService.queryAinTraResult();
		Integer totalCount = Integer.parseInt(page.getTotal() + "");//总体条数
		Integer totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1 ;
		ModelAndView modelAndView = new ModelAndView("/peixun/peixunfankui/list.jsp");
	    modelAndView.addObject("beans",beans);
	    modelAndView.addObject("nowPage",nowPage);
	    modelAndView.addObject("totalPage",totalPage);
	    modelAndView.addObject("totalCount",totalCount);
		return modelAndView;
	}
	
	
}
