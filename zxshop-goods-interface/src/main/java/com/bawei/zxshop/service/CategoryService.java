package com.bawei.zxshop.service;

import java.util.List;

import com.bawei.zxshop.pojo.Category;


/**
 * 
 * @ClassName: CategoryService 
 * @Description: 分类管理
 * @author: 28987
 * @date: 2020年6月27日 上午11:30:26
 */
public interface CategoryService {
	
	public int add(Category category);
	
	public int udpate(Category category);
	
	public int del(int id);
	
	public List<Category> list(int parentId);
	
	

}
