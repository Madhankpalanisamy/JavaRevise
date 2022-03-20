package day1.q9.org.allvehicle;

import day1.q9.org.fourwheeler.FourWheeler;
import day1.q9.org.threewheeler.ThreeWheeler;
import day1.q9.org.twowheeler.TwoWheller;

public class Vehicle {

	public void VehicleNecessery() {

		String VehicleNecessery = "Office Purpose";
		System.out.println("Vehicle Necessory : " + VehicleNecessery);
	}

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.VehicleNecessery();
		
		TwoWheller two = new TwoWheller();
		two.bike();
		two.cycle();
		
		ThreeWheeler three = new ThreeWheeler();
		three.Auto();
		
		FourWheeler four = new FourWheeler();
		four.bus();
		four.car();
		four.lorry();

	}

}
