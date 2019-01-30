package com.shiftedtech.bank;

public class BMW extends Car{
	private int year;
	

	public BMW() {
		this("MyBMW");
	}

	public BMW(String name) {
		this(name,1900);
	}
	
	public BMW(String name, int year) {
		super(name);
		this.year = year;
		
		System.out.println("Car name:" + name);
	}
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year < 1800) {
			throw new RuntimeException("Less then 1800 is not alowed");
		}
		else
		{
			this.year = year;
		}
		
	}

	@Override
	public void printName() {
		System.out.println("Name of the care is " + getName());
		super.printName();
		
	}
	public int printName(int z) {
		super.printName();
		System.out.println("Name of the care is " + getName());
		return 0;
	}
	public int printName(int z, String y) {
		
		//System.out.println("Name of the care is " + getName());
		//return this.printName(y,z);
		doMyWork();
		return 1;
	}
	
	public int printName(String z, int y) {
		
		System.out.println("Name of the care is " + getName());
		return 0;
	}
	
	private void doMyWork() {
		//return 0;
	}
}
