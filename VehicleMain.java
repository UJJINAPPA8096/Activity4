package com.InheritancePrgs;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		FourWheeler obj = new FourWheeler("KIA", "1234", "petrol", 20, 10);
		obj.displayMake();
		obj.displyBasicInfo();
		obj.displayDetailInfo();
		
	}

}
