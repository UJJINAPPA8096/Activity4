package com.InheritancePrgs;

public class TwoWheeler extends Vehicle{
	
	private Boolean kickStartAvailable;
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable=kickStartAvailable;
	}
	@Override
    public void displayDetailInfo() {
        System.out.println("Kick Start Available: " + kickStartAvailable);
    }

    // Getter and Setter methods
    public Boolean isKickStartAvailable() {
        return kickStartAvailable;
    }

    public void setKickStartAvailable(Boolean kickStartAvailable) {
        this.kickStartAvailable = kickStartAvailable;
    }

}
