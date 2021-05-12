package com.revature;

public class Vehicle {
	private int topSpeed;
	
	public Vehicle() {
		setTopSpeed(25);
	}
	
	public Vehicle(int speed) {
		setTopSpeed(speed);
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
}
