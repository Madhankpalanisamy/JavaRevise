package org.network;

public class Wifi {
	
	public void wifiName() {
		System.out.println("Wifi Name is : JIO ");
	}
	
	public static void main(String[] args) {
		
		Wifi wifi = new Wifi();
		wifi.wifiName();
		
		MobileData mdata = new MobileData();
		mdata.dataName();
		
		Lan lan = new Lan();
		lan.lanName();
		
		Wireless wless = new Wireless();
		wless.modamName();

	}

}
