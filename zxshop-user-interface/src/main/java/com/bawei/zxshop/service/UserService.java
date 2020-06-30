package com.bawei.zxshop.service;

import com.bawei.zxshop.pojo.User;

public interface UserService {

	//注册
	User register(User user);
	
	//登录
	User login(User user);
	
	//查找用户名是否存在 注册时唯一性验证
	User getUserByName(String name);
}
