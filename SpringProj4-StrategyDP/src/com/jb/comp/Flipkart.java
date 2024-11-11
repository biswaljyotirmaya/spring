package com.jb.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fkrt")
public class Flipkart {
	// Has-A relation
	@Autowired
	@Qualifier("dhl")
	private ICourier currier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart():0 parm constructor!");
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
