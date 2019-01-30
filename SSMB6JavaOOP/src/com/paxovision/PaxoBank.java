package com.paxovision;

import com.paxovision.bank.Account;
import com.paxovision.bank.CheckingAccount;
import com.paxovision.bank.SavingAccount;

import bank.IAccount;

public class PaxoBank {
	
	public static void  main(String[] args) {
		
		///CheckingAccount checkingAccount1 = new CheckingAccount("Iftekhar Ivaan", "12345678");
		//checkingAccount1.deposit(2000);
		//checkingAccount1.withdraw(200);
		//System.out.println("CheckingAccount1 Balance: " + checkingAccount1.getBalance());
	
		IAccount account = null;
		
		account = getAccount("Iftekhar", "78712345678");
		account.deposit(1000);
		account.withdraw(500);
		System.out.println("Balance: " + account.getBalance());
	
	}
	
	public static Account getAccount(String accountName, String accountNumber) {
		Account account = null;
		if(accountNumber.startsWith("123")) {
			account = new CheckingAccount(accountName, accountNumber);
		}
		else
		{
			account = new SavingAccount(accountName, accountNumber);
		}
		return account;
	}

}
