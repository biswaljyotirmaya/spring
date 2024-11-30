package com.jb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jb.DAO.IDoctorRepo;
import com.jb.model.Doctor;

@Service("doctorService")
public class DoctorManagementImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("Doctor id before save:"+doctor.getDoctId());
		Doctor doc=doctorRepo.save(doctor);
		return "Doctor object is saved with id value: "+ doc.getDoctId();
	}
}
