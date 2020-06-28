package com.bawei.zxshop.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.zxshop.pojo.Category;
import com.bawei.zxshop.service.CategoryService;



@Controller
@RequestMapping("cat")
public class CatController {
	
	@Reference
	CategoryService catService;
	
	/**
	 * 跳转到jsp 页面进行渲染
	 * @return
	 */
	@RequestMapping("index")
	public String index() {
		return "cat/index";
	}
	
	
	@RequestMapping("data")
	@ResponseBody
	public List<Category> getData(){
		// 获取到所有分类的数据
		 List<Category> categories = catService.list(0);
		 return categories;
		
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String add(Model model,Category category) {
		return catService.add(category)>0?"ok":"failed";
	}
	
	@RequestMapping("update")
	@ResponseBody
	public String update(Model model,Category category) {
		return catService.udpate(category)>0?"ok":"failed";
	}
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Model model,int id) {
		return catService.del(id)>0?"ok":"failed";
	}
	
	
}
