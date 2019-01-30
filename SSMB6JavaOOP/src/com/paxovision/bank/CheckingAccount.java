package com.paxovision.bank;

public  class CheckingAccount extends Account {

	public CheckingAccount(String accountName, String accountNumber) {
		super(accountName, accountNumber);
	}

	@Override
	public double getWithdrawFee() {
		return 2;
	}

}
