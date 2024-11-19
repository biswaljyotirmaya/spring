package com.jb.DAO;

import java.util.List;

import com.jb.model.Hospital;

public interface IHospitalDAO {
	public List<Hospital> getHospital(String loc1, String loc2, String loc3) throws Exception;

	public int insertHospital(Hospital hosp) throws Exception;
}
