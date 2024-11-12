package com.jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jb.DAO.IHospitalDAO;
import com.jb.model.Hospital;

@Service("hospService")
public class HospitalServiceImpl implements IHospitalService {

	@Autowired
	private IHospitalDAO hospdao;

	@Override
	public List<Hospital> fetchHospital(String loc1, String loc2, String loc3) throws Exception {

		loc1 = loc1.toUpperCase();
		loc2 = loc2.toUpperCase();
		loc3 = loc3.toUpperCase();

		List<Hospital> list = hospdao.getHospital(loc1, loc2, loc3);
		list.sort((Hospital hosp1, Hospital hosp2) -> hosp1.getLocation().compareTo(hosp2.getLocation()));
		System.out.println(list);
		return list;
	}

}
