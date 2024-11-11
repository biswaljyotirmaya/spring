package com.jb.vehicle;

public class PetrolEngine implements IEngine {

	@Override
	public String vehicle(String vehicle) {
		return " by "+vehicle + ", which is running with petrol engine!";
	}

}
