package com.jb.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired
	private LocalDate ld;

	public SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()");
	}


	public String findSeason() {
		int date = ld.getMonthValue();
		
		if (date > 3 && date <= 6) {
			return "Summer";
		} else if (date > 6 && date <= 10) {
			return "Rainy";
		} else {
			return "Winter";
		}
	}
}
