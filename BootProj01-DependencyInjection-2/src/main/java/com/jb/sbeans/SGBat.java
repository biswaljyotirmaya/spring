package com.jb.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("sgBat")
public final class SGBat implements ICricketBat {

	public SGBat() {
		System.out.println("SGBat costructor created!");
	}

	@Override
	public int socreRun() {
		System.out.println("SGBat.socreRun()");
		int score = new Random().nextInt(200);
		return score;
	}

}
