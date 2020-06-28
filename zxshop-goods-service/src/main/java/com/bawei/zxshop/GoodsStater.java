package com.bawei.zxshop;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @ClassName: GoodsStater 
 * @Description: 商品启动类
 * @author: 28987
 * @date: 2020年6月24日 下午8:50:38
 */
public class GoodsStater {
     public static void main(String[] args) throws IOException {
		System.out.println("商品启动开始");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-dubbo-provider.xml","classpath:applicationContext-dao.xml");
		context.start();
		System.out.println("启动成功");
		System.in.read();
	
	}
}
