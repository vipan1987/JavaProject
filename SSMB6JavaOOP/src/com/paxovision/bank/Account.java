package com.paxovision.bank;

import bank.IAccointInfo;
import bank.IAccount;

public abstract class Account implements IAccointInfo, IAccount{

	private String accountNumber;
	private String accountName;
	private double balance;
	private double TAX_RATE = .085;

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
		if(amount >= 1000) {
			balance = balance + amount + 10;
		}
		else
		{
			balance = balance + amount;
		}
		
		
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
	
	public  abstract double getWithdrawFee() ;

}
