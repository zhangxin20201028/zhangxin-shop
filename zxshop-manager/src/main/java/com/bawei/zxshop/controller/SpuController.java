package com.bawei.zxshop.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bawei.zxshop.pojo.Brand;
import com.bawei.zxshop.pojo.Spu;
import com.bawei.zxshop.pojo.SpuVo;
import com.bawei.zxshop.service.BrandService;
import com.bawei.zxshop.service.SpuService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("spu")
public class SpuController {

	@Reference
	SpuService spuService;
	//品牌
	@Reference
	BrandService brandService;
	
	@Autowired
	FileUtils fileUtils;
	
	@RequestMapping("list")
	public String list(Model model ,SpuVo spuVo) {
		
		PageInfo<Spu> pageInfo = spuService.list(spuVo);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("spuvo", spuVo);
		//得到所有的品牌
		List<Brand> brasngList = brandService.list();
		model.addAttribute("brandList", brasngList);
		return "spu/list";
	}
	
	@RequestMapping("toAdd")
	public String  toAdd(Model model) {
		List<Brand> brandList = brandService.list();
		model.addAttribute("brandList", brandList);
		return "spu/add";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String  add(Model model,Spu spu,@RequestParam("myFile")MultipartFile file) {
		
		String name = fileUtils.upload(file);
		spu.setSmallPic(name);
		return spuService.add(spu)>0?"ok":"failed";
	}
	
     //回显
	@RequestMapping("toUpdate")
	public String toUpdate(Model model,int id) {
		
		Spu spu = spuService.getById(id);
		model.addAttribute("spu", spu);
		// 得到所有的品牌
		List<Brand> brandList = brandService.list();
		model.addAttribute("brandList", brandList);
		
		return "spu/update";
	}
	
    //   修改
	@ResponseBody
	@RequestMapping("update")
	public String update(Model model,Spu spu,
			@RequestParam("myFile") MultipartFile file) {
		
		String uploadPath = fileUtils.upload(file);
		spu.setSmallPic(uploadPath);
		
		return spuService.update(spu)>0?"ok":"failed";
		
	}
	

	@RequestMapping("del")
	@ResponseBody
	public String del(Model model,@RequestParam("ids[]") int[] ids) {
		
		return spuService.delete(ids)>0?"ok":"failed";
		
	}
	
}
