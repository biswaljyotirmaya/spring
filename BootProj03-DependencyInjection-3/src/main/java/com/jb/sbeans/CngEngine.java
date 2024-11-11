package com.jb.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")
public class CngEngine implements IEngine {

	public CngEngine() {
		System.out.println("CNG engine created!");
	}

	@Override
	public String startEnginne() {
		String start = "CNG engine stated!";
		return start;
	}

	@Override
	public String stopEngine() {
		String stop = "CNG engine stopped!";
		return stop;
	}

}
