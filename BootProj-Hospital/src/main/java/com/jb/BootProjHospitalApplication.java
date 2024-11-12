package com.jb;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jb.model.Hospital;
import com.jb.service.HospitalServiceImpl;

@SpringBootApplication
public class BootProjHospitalApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProjHospitalApplication.class, args);
		HospitalServiceImpl empserv = ctx.getBean("hospService", HospitalServiceImpl.class);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter loc1:");
		String loc1 = sc.nextLine();
		System.out.println("Enter loc2:");
		String loc2 = sc.nextLine();
		System.out.println("Enter loc3:");
		String loc3 = sc.nextLine();

		try {
			List<Hospital> list = empserv.fetchHospital(loc1, loc2, loc3);
			list.forEach(hosp -> {
				System.out.println("\n" + hosp);
			});
		} catch (Exception e) {
			System.out.println("Internal error: " + e);
		}
		sc.close();
	}

}
