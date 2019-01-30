package com.shiftedtech.bank;

public enum Item {
	COKE("Coke",1.25),SODA("Soda",1.00);
	
	private String name;
	private double price;
	
	private Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	

}
