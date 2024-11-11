package com.jb.sbean;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalTime lt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public String wishMessage(String user) {
		System.out.println("WishMessageGenerator.wishMessage()");

		int hour = lt.getHour();
		if (hour < 12) {
			return "Good morning " + user + "!";
		} else if (hour >= 12 & hour < 16) {
			return "Good afternoon " + user + "!";
		} else if (hour >= 16 && hour < 20) {
			return "Good afternoon " + user + "!";
		} else {
			return "Good night " + user + "!";
		}
	}
}
