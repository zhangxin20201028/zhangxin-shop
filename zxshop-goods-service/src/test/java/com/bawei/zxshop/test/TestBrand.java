package com.bawei.zxshop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.bawei.zxshop.pojo.Brand;
import com.bawei.zxshop.service.BrandService;
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:applicationContext-dao.xml","classpath:applicationContext-dubbo-provider.xml"})
public class TestBrand {

	@Autowired
	BrandService brandService;
	
	@Test
	public void testGet() {
		Brand brand = brandService.getById(2);
		System.out.println(brand);
	}
}
