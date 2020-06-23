package com.bawei.zxshop.dao;

import java.util.List;

import com.bawei.zxshop.pojo.Brand;

public interface BrandDao {

	Brand findById(int id);

	List<Brand> queryAll();

}
