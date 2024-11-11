package com.jb.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	// Field injection
	@Autowired
	private LocalTime lt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:defaultConstructor");
	}

	// Business method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");

		// Getting the current hour of the day
		int hour = lt.getHour();

		// Generating the wish message
		if (hour < 12) {
			return "Good morning " + user;
		} else if (hour >= 12 && hour < 16) {
			return "Good afternoon " + user;
		} else if (hour >= 16 && hour < 20) {
			return "Good evening " + user;
		} else {
			return "Good night " + user;
		}
	}
}
