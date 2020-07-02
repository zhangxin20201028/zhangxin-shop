package com.bawei.zxshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bawei.zxshop.dao.CartDao;
import com.bawei.zxshop.pojo.Cart;
import com.bawei.zxshop.service.CartService;
@Service(interfaceClass = CartService.class)
public class CartServiceImpl implements CartService{

	@Autowired
	CartDao cartDao;
	
	@Override
	public int add(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.add(cart);
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return cartDao.delete(ids);
	}

	@Override
	public List<Cart> list(int uid) {
		// TODO Auto-generated method stub
		return cartDao.list(uid);
	}

	@Override
	public List<Cart> ListById(int[] ids) {
		// TODO Auto-generated method stub
		return cartDao.listById(ids);
	}

}
