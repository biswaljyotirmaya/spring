package com.jb.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jb.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	@Bean(name="ldate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}

}
