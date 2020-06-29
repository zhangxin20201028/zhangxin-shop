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

import com.bawei.zxshop.pojo.Sku;
import com.bawei.zxshop.pojo.SkuVo;
import com.bawei.zxshop.pojo.Spec;
import com.bawei.zxshop.pojo.SpecOption;
import com.bawei.zxshop.pojo.Spu;
import com.bawei.zxshop.service.SkuService;
import com.bawei.zxshop.service.SpecService;
import com.bawei.zxshop.service.SpuService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("sku")
public class SkuController {

	@Reference
	SkuService skuService;
	@Reference
	SpuService spuService;
	@Reference
	SpecService specService;
	@Autowired
	FileUtils fileUtils;
	
	@RequestMapping("list")
	public String list(Model model,SkuVo skuVo) {
		
		PageInfo<Sku> pageInfo = skuService.list(skuVo);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("skuVo", skuVo);
		return "sku/list";
	}
	/**
	 * 
	 * @Title: toAdd 
	 * @Description: 进入添加页面
	 * @param model
	 * @param spuId
	 * @return
	 * @return: String
	 */
	@RequestMapping("toAdd")
	public String toAdd(Model model,int spuId) {
		Spu spu = spuService.getById(spuId);
		model.addAttribute("spu", spu);
		List<Spec> specList = specService.listAll();
		model.addAttribute("specList", specList);
		return "sku/add";
	}
	/**
	 * 
	 * @Title: getOptions 
	 * @Description:获取规格属性
	 * @param specId
	 * @return
	 * @return: List<SpecOption>
	 */
	@RequestMapping("getSpecOptions")
	@ResponseBody
	public List<SpecOption> getOptions(int specId){
		Spec spec = specService.getById(specId);
		if (spec==null) {
			return null;			
		}
		return spec.getOptions();
	}
	/**
	 * 
	 * @Title: add 
	 * @Description: 添加SKU
	 * @param model
	 * @param sku
	 * @return
	 * @return: String
	 */
	@RequestMapping("add")
	@ResponseBody
	public String add(Model model,Sku sku,@RequestParam("imageFile")MultipartFile imageFile,@RequestParam("cartThumbnailFile")MultipartFile cartThumbnailFile) {
		List<SpecOption> list = sku.getOptions();
		//数据清理
		for (int i = list.size()-1; i >=0; i--) {
			SpecOption option = list.get(i);
			if(null==option.getSpecid()|| 0==option.getSpecid()) {
				list.remove(i);
			}
		}
		
		sku.setImage(fileUtils.upload(imageFile));
		sku.setCartThumbnail(fileUtils.upload(cartThumbnailFile));
		return skuService.add(sku)>0?"ok":"failed";
	}
}
