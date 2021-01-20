package com.qa.main;

public class Mechanic {
	
	private int flatLabourCost;

	public int getFlatLabourCost() {
		return flatLabourCost;
	}

	public void setFlatLabourCost(int flatLabourCost) {
		this.flatLabourCost = flatLabourCost;
	}
	
	public int fixCar(Car car) {
		int result = car.getcostFix() + (10 * car.getWheels()) + (20 * car.getSeats()) + this.getFlatLabourCost();
		return result;
	}

}
