package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.jb.sbeans.Journey;

@SpringBootApplication
@ImportResource("com/jb/config/applicationContext.xml")
public class BootProj03DependencyInjection3Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03DependencyInjection3Application.class, args);
		Journey trip = ctx.getBean("jrny", Journey.class);
		String msg = trip.journeyStarted();
		System.out.println(msg + "\nJourney completed at ladakh!");
	}

}
