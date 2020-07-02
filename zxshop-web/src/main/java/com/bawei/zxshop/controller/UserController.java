package com.bawei.zxshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.zxshop.common.MsgData;
import com.bawei.zxshop.pojo.Cart;
import com.bawei.zxshop.pojo.User;
import com.bawei.zxshop.service.CartService;
import com.bawei.zxshop.service.UserService;
/**
 * 
 * @ClassName: UserController 
 * @Description: 用户
 * @author: 28987
 * @date: 2020年6月30日 下午2:42:35
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Reference
	UserService userService;
	
	@Reference
	CartService cartService;
	
	//去登陆
	@GetMapping("login")
	public String toLogin(HttpServletRequest request) {
		return "user/login";
	}	
	
	@PostMapping("login")
	public String toLogin(HttpServletRequest request,User user) {
		
		User loginUser = userService.login(user);
		if(loginUser == null)
			return "user/login";
		
		//登录成功
		request.getSession().setAttribute("USERSESSION", loginUser);
		return "redirect:home";
	}	
	
	@RequestMapping("checkExist")
	@ResponseBody
	public boolean checkExist(String username) {
		return null==userService.getUserByName(username);	
	}
	
	
	@GetMapping("register")
	public String register(HttpServletRequest request) {
		return "user/register";
	}	
	
	@PostMapping("register")
	public String register(HttpServletRequest request,User user) {
		
		User reguser = userService.register(user);
		if(reguser!=null)
			return "redirect:login";
		
		return "user/register";
	}	
	
	@RequestMapping("home")
	public String home() {
		return "user/home";
	}
	/**
	 * 
	 * @Title: addCart 
	 * @Description: 加入购物车
	 * @param request
	 * @param cart
	 * @return
	 * @return: MsgData
	 */
	@RequestMapping("addCart")
	@ResponseBody
	public MsgData addCart(HttpServletRequest request,Cart cart) {
		User loginUser= (User) request.getSession().getAttribute("USERSESSION");
		if (loginUser==null) {
			return new MsgData(1,"对不起,您尚未登录");
		}
		//设置用户ID
		cart.setUid(loginUser.getUid());
		int i=cartService.add(cart);
		return i>0?new MsgData("保存成功"):new MsgData(2,"加入失败请稍后再试");
	
	}
	
	@RequestMapping("cartlist")
	public String cartlist(HttpServletRequest request) {
		User loginUser= (User) request.getSession().getAttribute("USERSESSION");
		List<Cart> list = cartService.list(loginUser.getUid());
		request.setAttribute("cartList", list);
		return "user/cartList";
	}
}
