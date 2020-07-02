package com.bawei.zxshop.dao;

import java.util.List;

import com.bawei.zxshop.pojo.Cart;

public interface CartDao {

	int add(Cart cart);

	int delete(int[] ids);

	List<Cart> list(int uid);

	List<Cart> listById(int[] ids);

}
