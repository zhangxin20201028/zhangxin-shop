package com.bawei.zxshop.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.zxshop.pojo.Spec;
import com.bawei.zxshop.pojo.SpecOption;
import com.bawei.zxshop.service.SpecService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("spec")
public class SpecController {

	@Reference
	SpecService specService;
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "8") int pageSize,String name,Spec spec) {
		
		PageInfo<Spec> pageInfo = specService.list(pageNum, pageSize,spec);
		model.addAttribute("pageInfo", pageInfo);
		return "spec/list";
	}
	
	@GetMapping("add")
	public String add() {
		return "spec/add";
	}
	
	@PostMapping("add")
	@ResponseBody
	public String add(Model model,Spec spec) {
		System.out.println("spec  is  "+spec);
		List<SpecOption> options = spec.getOptions();
		for (int i = options.size()-1; i >=0; i--) {
			SpecOption option = options.get(i);
			if(option.getOptionName()==null || "".equals(option.getOptionName())) {
				options.remove(i);
			}
		}
		return specService.add(spec)>0?"ok":"failed";
	}
	
	@RequestMapping("del")
	@ResponseBody
	public String del(Model model,@RequestParam(value = "ids[]")  int[] ids) {
		System.out.print("ids is " + ids);
		return specService.delete(ids)>0?"ok":"failed";
	}
	
	/**
	 * 跳转到修改的jsp页面
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("toUpdate")
	public String toUpdate(Model model,int id) {
		Spec spec = specService.getById(id);
		model.addAttribute("spec", spec);
		return "spec/update";
	}
	
	
	/**
	 * 
	 * @param request
	 * @param spec
	 * @return
	 */
	@RequestMapping("update")
	@ResponseBody
	public String update(Model model,Spec spec) {
		
		return specService.update(spec)>0?"ok":"failed";
	}
	
	
}
