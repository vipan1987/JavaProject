package com.shiftedtech.bank;

public  class CheckingAccount extends Account{

	public CheckingAccount(String accountName, String accountNumber) {
		super(accountName, accountNumber);
	}

	@Override
	public double getWithdrawFee() {
		return 1;
	}

}
