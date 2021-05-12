package com.revature;

public class Car extends Vehicle {
	private int numberOfWheels;
	
	public Car() {
		setNumberOfWheels(4);
		setTopSpeed(80);
	}
	
	public Car(int wheels, int topspeed) {
		setNumberOfWheels(wheels);
		setTopSpeed(topspeed);
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		if (numberOfWheels < 3) {
			this.numberOfWheels = 3;
		} else {
			this.numberOfWheels = numberOfWheels;
		}
	}

}
