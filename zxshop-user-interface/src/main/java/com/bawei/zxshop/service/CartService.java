package com.bawei.zxshop.service;

import java.util.List;

import com.bawei.zxshop.pojo.Cart;
/**
 * 
 * @ClassName: CartService 
 * @Description: 购物车服务
 * @author: 28987
 * @date: 2020年7月2日 上午8:28:42
 */
public interface CartService {

	int add(Cart cart);
	
	int delete(int[] ids);
	/**
	 * 
	 * @Title: list 
	 * @Description: UID 用户id
	 * @param uid
	 * @return
	 * @return: List<Cart>
	 */
	List<Cart> list(int uid);
	
	List<Cart> ListById(int[] ids);
	
	
	
}
