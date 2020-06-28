package com.bawei.zxshop.dao;

import java.util.List;

import com.bawei.zxshop.pojo.Spu;
import com.bawei.zxshop.pojo.SpuVo;
import com.github.pagehelper.PageInfo;

public interface SpuDao {

	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	List<Spu> list(SpuVo spuVo);
	Spu findById(int id);
}
