package com.jb.factory;

import com.jb.comp.BlueDart;
import com.jb.comp.DHL;
import com.jb.comp.DTDC;
import com.jb.comp.Flipkart;
import com.jb.comp.ICourier;

public class FlipkartFactory {

//	static factory method having factory pattern logic
	public static Flipkart getInstance(String curriorType) {
		System.out.println("FlipkartFactory.getInstance(): is called to get Instance");
		// creating dependent class object
		ICourier currier = null;
		if (curriorType.equalsIgnoreCase("dtdc")) {
			System.out.println("FlipkartFactory.getInstance(: creating instace of DTDC)");
			currier = new DTDC();
		} else if (curriorType.equalsIgnoreCase("dhl")) {
			System.out.println("FlipkartFactory.getInstance(: creating instace of DHL)");
			currier = new DHL();
		} else if (curriorType.equalsIgnoreCase("bluedart")) {
			System.out.println("FlipkartFactory.getInstance(: creating instace of Bluedart)");
			currier = new BlueDart();
		} else {
			throw new IllegalArgumentException("Invalid currier type!");
		}

		Flipkart fkt = new Flipkart();
		fkt.setCourier(currier);

		return fkt;
	}
}
