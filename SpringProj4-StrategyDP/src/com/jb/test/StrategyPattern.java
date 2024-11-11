package com.jb.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jb.comp.Flipkart;
import com.jb.config.AppConfig;

public class StrategyPattern {

	public static void main(String[] args) {
		System.out.println("StrategyPattern.main(): start");
		//creating IOC container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fkrt = ctx.getBean("fkrt",Flipkart.class);
		//invoking the business method
		String msg = fkrt.shopping(new String[] { "Shirt, Trouser, Wallet" }, new double[] { 5000.0, 3000.0, 2000.0 });
		System.out.println(msg);
		System.out.println("StrategyPattern.main(): end");
		ctx.close();
	}

}
