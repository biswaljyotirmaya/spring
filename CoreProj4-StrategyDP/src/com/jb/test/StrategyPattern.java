package com.jb.test;

import com.jb.comp.Flipkart;
import com.jb.factory.FlipkartFactory;

public class StrategyPattern {

	public static void main(String[] args) {
		System.out.println("StrategyPattern.main(): start");
		Flipkart fkrt = FlipkartFactory.getInstance("blueDart");
		String msg = fkrt.shopping(new String[] { "Shirt, Trouser, Wallet" }, new double[] { 5000.0, 3000.0, 2000.0 });
		System.out.println(msg);
		System.out.println("StrategyPattern.main(): end");
	}

}
