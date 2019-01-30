package com.shiftedtech;

import com.shiftedtech.bank.CarAccount;
import com.shiftedtech.bank.CheckingAccount;
import com.shiftedtech.bank.SavingAccount;

public class ShiftBank {
	
	public static void  main(String[] args) {
		System.out.println("My Shift Bank");
		
		
		CheckingAccount checkingAccount1 = new CheckingAccount("Iftekhar Ivaan", "12345678");
		SavingAccount savingAccount1 = new SavingAccount("Shehla Zamani", "12345679");
		
		checkingAccount1.deposit(1000);
		checkingAccount1.withdraw(200);
		System.out.println("CheckingAccount1 Balance: " + checkingAccount1.getBalance());
		
		savingAccount1.deposit(7000);
		savingAccount1.withdraw(800);
		System.out.println("SavingAccount1 Balance: " + savingAccount1.getBalance());
	
		CarAccount ca = new CarAccount();
		ca.setCarName("MyCar");
		ca.getCar().printName();
		ca.getAccount().deposit(1000);
		ca.getAccount().getBalance();
	
	}

}
