package day1.q10.org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	
	public void TransportForm() {
		
		System.out.println("Here We can have all the information which is related to transport");
	}
	
	
	public static void main(String[] args) {
		
		Transport tps= new Transport();
		tps.TransportForm();
		
		Road road = new Road();
		road.bike();
		road.bus();
		road.car();
		road.cycle();
		
		Air air = new Air();
		air.aeroPlane();
		air.heliCopter();
		
		Water wter = new Water();
		wter.boat();
		wter.ship();
		
	}

}
