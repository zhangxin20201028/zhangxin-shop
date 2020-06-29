package com.bawei.zxshop.service;

import com.bawei.zxshop.pojo.Sku;
import com.bawei.zxshop.pojo.SkuVo;

import com.github.pagehelper.PageInfo;

public interface SkuService {

	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	PageInfo<Sku> list(SkuVo skuVo);
	Sku getById(int id);
}
