package com.jb.service;

import java.util.List;

import com.jb.model.Hospital;

public interface IHospitalService {
	public List<Hospital> fetchHospital(String loc1, String loc2, String loc3) throws Exception;

	public String insertHospitalDetails(Hospital hosp) throws Exception;
}
