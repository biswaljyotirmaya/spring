package com.jb.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DiselEngine implements IEngine {

	public DiselEngine() {
		System.out.println("Disel engine created!");
	}

	@Override
	public String startEnginne() {
		String start = "Disel engine stated!";
		return start;
	}

	@Override
	public String stopEngine() {
		String stop = "Disel engine stopped!";
		return stop;
	}

}
