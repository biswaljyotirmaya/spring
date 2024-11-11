package com.jb.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jb.config.AppConfig;

public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}
}
