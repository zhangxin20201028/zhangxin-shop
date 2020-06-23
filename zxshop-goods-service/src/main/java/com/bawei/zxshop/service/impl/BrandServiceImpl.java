package com.bawei.zxshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bawei.zxshop.dao.BrandDao;
import com.bawei.zxshop.pojo.Brand;
import com.bawei.zxshop.service.BrandService;
import com.github.pagehelper.PageInfo;
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService{

	@Autowired
	BrandDao brandDao;
	
	@Override
	public int add(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageInfo<Brand> list(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return brandDao.findById(id);
	}

	@Override
	public List<Brand> list() {
		// TODO Auto-generated method stub
		return brandDao.queryAll();
	}

}
