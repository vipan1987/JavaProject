package com.paxovision.bank;

public class SavingAccount extends Account {

	public SavingAccount(String accountName, String accountNumber) {
		super(accountName, accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getWithdrawFee() {
		return 4;
	}

}
