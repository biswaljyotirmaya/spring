package com.jb.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jb.config.AppConfig;
import com.jb.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main().(Start)");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Object obj = ctx.getBean("sf");

		SeasonFinder generator = (SeasonFinder) obj;

		String season = generator.findSeason();

		System.out.println("This is " + season + " season!");
		ctx.close();

		System.out.println("DependencyInjectionTest.main().(End)");
	}

}
