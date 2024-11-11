package com.jb.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("Petrol engine created!");
	}

	@Override
	public String startEnginne() {
		String start = "Petrol engine stated!";
		return start;
	}

	@Override
	public String stopEngine() {
		String stop = "Petrol engine stopped!";
		return stop;
	}

}
