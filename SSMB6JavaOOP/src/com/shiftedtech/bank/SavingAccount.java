package com.shiftedtech.bank;

public class SavingAccount extends Account{

	public SavingAccount(String accountName, String accountNumber) {
		super(accountName, accountNumber);
	}

	@Override
	public double getWithdrawFee() {
		return 2;
	}

}
