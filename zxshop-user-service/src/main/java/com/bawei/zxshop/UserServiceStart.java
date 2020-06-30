package com.bawei.zxshop;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @ClassName: UserServiceStart 
 * @Description: 启动服务
 * @author: 28987
 * @date: 2020年6月30日 下午2:25:35
 */
public class UserServiceStart {

	public static void main(String[] args) throws IOException {
		System.out.println("启动用户服务");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml","classpath:applicationContext-dubbo-provider.xml");
		context.start();
		System.out.println("启动用户服务成功");
		System.in.read();
	}
}
