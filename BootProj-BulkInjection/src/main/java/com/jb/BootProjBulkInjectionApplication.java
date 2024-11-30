package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jb.model.EmployeeDetails;

@SpringBootApplication
public class BootProjBulkInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProjBulkInjectionApplication.class, args);
		EmployeeDetails emp = ctx.getBean("empDetails", EmployeeDetails.class);
		System.out.println(emp);
	}

}
