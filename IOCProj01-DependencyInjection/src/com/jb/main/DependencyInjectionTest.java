package com.jb.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jb.config.AppConfig;
import com.jb.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main(Start)");
		// Creating the IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Getting the spring bean object reference
		Object obj = ctx.getBean("wmg");

		// TypeCasting the bean object
		WishMessageGenerator generator = (WishMessageGenerator) obj;

		// Invoking the business method
		String message = generator.generateWishMessage("David");
		System.out.println("Message: " + message);

		// Closing the container
		ctx.close();
		System.out.println("DependencyInjectionTest.main(End)");
	}

}
