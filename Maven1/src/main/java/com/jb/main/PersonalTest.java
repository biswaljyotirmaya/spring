package com.jb.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jb.config.AppConfig;
import com.jb.sbeans.PersonalInfo;

public class PersonalTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonalInfo info = ctx.getBean("pinfo", PersonalInfo.class);
		System.out.println(info);
	}
}