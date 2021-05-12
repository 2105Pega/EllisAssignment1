package com.revature;

public class Driver {

	public static void main(String args[]) {
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle(90);
		
		//make a BRZ
		Car brz = new Car();
		brz.setTopSpeed(145);
		
		// make a Reliant Robin
		Car reliant = new Car(3, 85);
		
		Person matt = new Person();
		matt.setName("Matt");
		matt.setCar(brz);
		
		System.out.println("Matt's top speed is " + matt.getCar().getTopSpeed());
	}

}
