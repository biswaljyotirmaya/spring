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
		HospitalServiceImpl hospital = ctx.getBean("hospService", HospitalServiceImpl.class);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter loc1:");
		String loc1 = sc.nextLine();
		System.out.println("Enter loc2:");
		String loc2 = sc.nextLine();
		System.out.println("Enter loc3:");
		String loc3 = sc.nextLine();

		try {
			List<Hospital> list = hospital.fetchHospital(loc1, loc2, loc3);
			list.forEach(hosp -> {
				System.out.println("\n" + hosp);
			});
		} catch (Exception e) {
			System.out.println("Internal error: " + e);
		}

//		System.out.println("--------------------------Hospital Registration---------------------------");
//		System.out.println("Enter hospital name:");
//		String name = sc.nextLine();
//		System.out.println("Enter hospital location:");
//		String loc = sc.nextLine();
//		System.out.println("Enter contact no:");
//		String contact = sc.nextLine();
//		System.out.println("Enter bad capacity:");
//		int badCapacity = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter date established[yyyy-mm-dd]:");
//		String datEstablised = sc.nextLine();
//
//		Hospital hosp = new Hospital();
//		hosp.setHName(name);
//		hosp.setLocation(loc);
//		hosp.setContact(contact);
//		hosp.setBedCapacity(badCapacity);
//		hosp.setEstablished(datEstablised);
//
//		try {
//			String resultMsg = hospital.insertHospitalDetails(hosp);
//			System.out.println(resultMsg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		sc.close();
	}

}
