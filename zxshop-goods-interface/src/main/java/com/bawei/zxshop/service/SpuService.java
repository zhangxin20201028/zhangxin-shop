package com.bawei.zxshop.service;

import com.bawei.zxshop.pojo.Spu;
import com.bawei.zxshop.pojo.SpuVo;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: SpuService 
 * @Description: spu管理
 * @author: 28987
 * @date: 2020年6月28日 上午11:33:37
 */
public interface SpuService {

	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	PageInfo<Spu> list(SpuVo spuVo);
	Spu getById(int id);
}
