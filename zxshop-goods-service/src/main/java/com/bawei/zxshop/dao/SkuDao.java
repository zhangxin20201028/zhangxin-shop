package com.bawei.zxshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.zxshop.pojo.Sku;
import com.bawei.zxshop.pojo.SkuVo;
import com.bawei.zxshop.pojo.SpecOption;

public interface SkuDao {

	int insert(Sku sku);

	int insertSpecOption(@Param("skuId")int id,@Param("opt") SpecOption specOption);
	
	Sku findById(int id);
	int update(Sku sku);
	
	int delete(int[] ids);
	int deleteSpecOption(int ... id);

	List<Sku> list(SkuVo skuVo);

	// 用于显示商品详情使用
	List<Sku> ListBySpuId(int spuId);
}
