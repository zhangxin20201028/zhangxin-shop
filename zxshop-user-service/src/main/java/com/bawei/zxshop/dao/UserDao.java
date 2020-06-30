package com.bawei.zxshop.dao;

import com.bawei.zxshop.pojo.User;

public interface UserDao {

	int add(User user);

	User findUserById(Integer uid);

	User findUser(User user);

	User findByName(String name);

}
