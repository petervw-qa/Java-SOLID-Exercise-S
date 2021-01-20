package com.qa.main;

public class Car {

    // the car should only be responsible for maintaining its
    // core attributes!
    private String colour;
    private String model;
    private int mileage;
    private int wheels;
    private int seats;
    private int costFix;

    // constructor
    public Car(String colour, String model, int mileage, int wheels, int seats, int costFix) {
  		super();
  		this.colour = colour;
  		this.model = model;
  		this.mileage = mileage;
  		this.wheels = wheels;
  		this.seats = seats;
  		this.costFix = costFix;
  	}
    
    public String getColour() {
        return colour;
    }

	public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getcostFix() {
		return costFix;
	}

	public void setcostFix(int costFix) {
		this.costFix = costFix;
	}
    
	

}