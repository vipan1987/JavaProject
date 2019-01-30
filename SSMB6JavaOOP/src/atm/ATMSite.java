package atm;

import com.shiftedtech.bank.CheckingAccount;

import bank.IAccount;

public class ATMSite {
	
	public static void  main(String[] args) {
		System.out.println("********* ATM Site ***********");
		
		IAccount account1 = AccountFactory.getAccount("12345678");
		IAccount account2 = AccountFactory.getAccount("3456789012");
		
		account1.deposit(2000);
		account2.deposit(2000);
		
		
		
	}

}
