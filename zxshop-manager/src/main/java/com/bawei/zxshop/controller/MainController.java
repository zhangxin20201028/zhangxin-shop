package com.bawei.zxshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping({"/","main","index"})
	public String main() {
		return "main";
	}
}
