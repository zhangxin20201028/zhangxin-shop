package com.bawei.zxshop.service;

import java.util.List;

import com.bawei.zxshop.pojo.Brand;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: BrandService 
 * @Description: 品牌的管理
 * @author: 28987
 * @date: 2020年6月23日 下午8:46:52
 */
public interface BrandService {

	int add(Brand brand);
	int update(Brand brand);
	int delete(Brand brand);
	PageInfo<Brand> list(Brand brand);
	Brand getById(int id);
	List<Brand> list();
}
