package com.bawei.zxshop.service;

import java.util.List;

import com.bawei.zxshop.pojo.Sku;
import com.bawei.zxshop.pojo.SkuVo;

import com.github.pagehelper.PageInfo;

public interface SkuService {

	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	PageInfo<Sku> list(SkuVo skuVo);
	Sku getById(int id);
	// 根据spu 获取sku的集合，同时包含规格详情
	List<Sku> listDetailBySpu(int spuId);
}
