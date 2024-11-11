package com.jb.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jb.sbeans")
public class AppConfig {
	
	public AppConfig(){
		System.out.println("AppConfig.AppConfig():Default Constructor");
	}

	@Bean(name = "ltime")
	public LocalTime createTime() {
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();
	}
}
