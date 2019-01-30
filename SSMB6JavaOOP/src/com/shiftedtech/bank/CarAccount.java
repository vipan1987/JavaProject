package com.shiftedtech.bank;

public class CarAccount {
	
	private Car car;
	private Account account;
	
	public CarAccount() {
		BMW car = new BMW();
		account = new CheckingAccount("Iftekhar", "12345678");
	}
	
	public Car getCar() {
		return car;
	}
	public Account getAccount() {
		return account;
	}

	public void setCarName(String name) {
		car.setName(name);
	}
	
	public void setCarYear(int year) {
		if (car instanceof BMW) {
			((BMW) car).setYear(year);
		}
		
		//car.setYear(year);
		//new BMW()
		
	}
}
