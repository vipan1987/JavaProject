package com.shiftedtech.bank;

public abstract class Car {
	
	private String name;

	public Car(String name) {
		int age;
		this.name = name;
		
		
	}

	public String getName() {
		return name;
	}

	public void printName() {
		System.out.println("Car name is " + this.name);
	}

	void setName(String name) {
		this.name = name;
	}
	

	
}
