package com.jb.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cktr")
public final class Cricketer {
	@Autowired
	@Qualifier("bat")
	private ICricketBat bat;
	
	public Cricketer() {
		System.out.println("Cricketer constructor class loaded");
	}

	public String batting() {
		System.out.println("Cricketer.batting()");
		int run = bat.socreRun();
		return "Ms. Scored " + run + " runs";
	}
}
