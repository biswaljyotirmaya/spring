package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.jb.sbeans.Cricketer;

@SpringBootApplication
@ImportResource("com/jb/config/applicationContext.xml")
public class BootProj01DependencyInjection2Application {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootProj01DependencyInjection2Application.class, args);
		Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
		String msg = cktr.batting();
		System.out.println(msg);
	}

}
