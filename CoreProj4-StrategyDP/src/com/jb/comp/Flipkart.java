package com.jb.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	// Has-A relation
	private ICourier currier;

	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.currier = courier;
	}

	// business logic
	public String shopping(String items[], double price[]) {
		System.out.println("Flipkart.shopping(): generating bill!");
		// calculate bill amount
		double billAmt = 0.0;
		for (double amt : price) {
			billAmt = billAmt + amt;
		}
		// generating random order id
		int oid = new Random().nextInt(100000);
		// deliver the item via currier
		String msg = currier.deliver(oid);

		return Arrays.toString(items) + " items with billAmount: " + billAmt + " -----" + msg;
	}
}
