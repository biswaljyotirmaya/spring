package com.jb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jb.model.Doctor;
import com.jb.service.IDoctorService;

@Component
public class DoctorRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		try {
			Doctor doctor = new Doctor();
			doctor.setDoctName("David");
			doctor.setDoctSpec("Surgery");
			doctor.setDoctSal(99999.08);

			String msg = doctorService.registerDoctor(doctor);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
