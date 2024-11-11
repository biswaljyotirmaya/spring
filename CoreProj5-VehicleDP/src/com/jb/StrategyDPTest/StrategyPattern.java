package com.jb.StrategyDPTest;

import com.jb.VehiceFactory.VehicleFactory;
import com.jb.vehicle.Vehicle;

public class StrategyPattern {
	public static void main(String[] args) {
		System.out.println("StrategyPattern.main():start!");
		Vehicle vc = VehicleFactory.getVehicleInstance("petrol");
		String msg = vc.journey("Hyderabad", "Pune", "car");
		System.out.println(msg);
		System.out.println("StrategyPattern.main():end!");
	}
}
