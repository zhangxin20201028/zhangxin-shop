package com.bawei.zxshop.service;

import com.bawei.zxshop.pojo.Spec;
import com.github.pagehelper.PageInfo;

public interface SpecService {
	
	//添加
	int add(Spec spec);
	//删除
	int delete(int[] ids);
	//修改
	int update(Spec spec);
	//列表
	PageInfo<Spec> list(int pageNum,int pageSize,Spec spec);
	//回显
	Spec getById(int id);
}
