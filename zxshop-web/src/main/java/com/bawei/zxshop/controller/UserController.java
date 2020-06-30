package com.bawei.zxshop.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.zxshop.pojo.User;
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
		return "user/home";
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
}
