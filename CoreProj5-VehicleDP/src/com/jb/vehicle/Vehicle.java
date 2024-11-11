package com.jb.vehicle;

public class Vehicle {
	private IEngine engine;

	public void setEngine(IEngine engine) {
		System.out.println("Vehicle.setEngine(): Asigning engine type to the vehicle!");
		this.engine = engine;
	}

	// logic
	public String journey(String startPlace, String endPlace, String vehicleType) {
		String msg = engine.vehicle(vehicleType);
		return "Journey started from " + startPlace + " to " + endPlace + " " + msg;
	}
}
