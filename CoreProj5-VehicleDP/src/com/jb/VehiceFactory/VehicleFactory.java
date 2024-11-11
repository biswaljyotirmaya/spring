package com.jb.VehiceFactory;

import com.jb.vehicle.DiselEngine;
import com.jb.vehicle.ElectricEngine;
import com.jb.vehicle.IEngine;
import com.jb.vehicle.PetrolEngine;
import com.jb.vehicle.Vehicle;

public class VehicleFactory {
	public static Vehicle getVehicleInstance(String vehicleType) {
		System.out.println("VehicleFactory.getVehicleInstance(): generating instance!");
		IEngine engine = null;
		// generating required instance
		if (vehicleType.equalsIgnoreCase("petrol")) {
			System.out.println("VehicleFactory.getVehicleInstance(): generated petrol instance!");
			engine = new PetrolEngine();
		} else if (vehicleType.equalsIgnoreCase("disel")) {
			System.out.println("VehicleFactory.getVehicleInstance(): generated disel instance!)");
			engine = new DiselEngine();
		} else if (vehicleType.equalsIgnoreCase("electric")) {
			System.out.println("VehicleFactory.getVehicleInstance(): generated engline instance!");
			engine = new ElectricEngine();
		} else {
			throw new IllegalArgumentException("Invlaid engine type!");
		}

		Vehicle vc = new Vehicle();
		vc.setEngine(engine);

		return vc;
	}
}
