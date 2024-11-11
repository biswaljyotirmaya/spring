package com.jb.vehicle;

public class DiselEngine implements IEngine {

	@Override
	public String vehicle(String vehicle) {
		return " by "+vehicle + "+, which is running with disel engine!";
	}

}
