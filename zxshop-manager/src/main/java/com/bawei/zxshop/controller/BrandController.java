package com.bawei.zxshop.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.zxshop.pojo.Brand;
import com.bawei.zxshop.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {

	@Reference
	BrandService brandService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Brand> list = brandService.list();
		System.out.println(list);
		model.addAttribute("list",list);
		return "brand/list";
	}
}
