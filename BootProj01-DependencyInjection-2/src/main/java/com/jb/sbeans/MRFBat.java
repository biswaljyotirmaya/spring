package com.jb.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("mrfBat")
public final class MRFBat implements ICricketBat {

	public MRFBat() {
		System.out.println("MRFBat costructor created!");
	}

	@Override
	public int socreRun() {
		System.out.println("MRFBat.socreRun()");
		int score = new Random().nextInt(200);
		return score;
	}

}
