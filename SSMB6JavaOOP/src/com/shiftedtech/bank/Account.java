package com.shiftedtech.bank;

import bank.IAccointInfo;
import bank.IAccount;

public abstract class Account  implements IAccointInfo, IAccount{
	
	private String accountNumber;
	private String accountName;
	private double balance;

	public Account(String accountName, String accountNumber) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount > 100) {
			balance = (balance - amount) - getWithdrawFee();
		}
		else
		{
			balance = (balance - amount);
		}
		
	}

	@Override
	public String getAccountName() {
		return accountName;
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public abstract double getWithdrawFee();
	
	/*public  double getWithdrawFee() {
		return 0;
	}*/
	
	void dothis() {
		
	}

}
