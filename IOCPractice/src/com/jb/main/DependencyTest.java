package com.jb.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jb.config.AppConfig;
import com.jb.sbean.WishMessageGenerator;

public class DependencyTest {
	public static void main(String[] args) {
		System.out.println("DependencyTest.main():start");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		String msg = generator.wishMessage("David");
		System.out.println(msg);
		System.out.println("DependencyTest.main():end");
		ctx.close();
	}
}
