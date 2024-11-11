package com.jb.vehicle;

public class ElectricEngine implements IEngine {

	@Override
	public String vehicle(String vehicle) {
		return " by "+vehicle + ", which is running with electric engine!";
	}

}
