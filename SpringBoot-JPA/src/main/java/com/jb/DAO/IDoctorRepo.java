package com.jb.DAO;

import org.springframework.data.repository.CrudRepository;

import com.jb.model.Doctor;

public 	interface IDoctorRepo extends CrudRepository<Doctor, Integer> {

}
