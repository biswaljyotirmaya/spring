package com.jb.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("jrny")
public class Journey {

	@Autowired
	@Qualifier("engine")
	private IEngine engine;

	public String journeyStarted() {
		System.out.println("Journey.journeyStarted()");
		String start = engine.startEnginne();
		String stop = engine.stopEngine();
		String trip = "Journey stated to ladakh!\n" + start + "\n" + stop;
		return trip;
	}
}
