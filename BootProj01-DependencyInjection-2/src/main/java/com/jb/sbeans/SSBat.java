package com.jb.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("ssBat")
public final class SSBat implements ICricketBat {

	public SSBat() {
		System.out.println("SSBat costructor created!");
	}

	@Override
	public int socreRun() {
		System.out.println("SSBat.socreRun()");
		int score = new Random().nextInt(200);
		return score;
	}

}
