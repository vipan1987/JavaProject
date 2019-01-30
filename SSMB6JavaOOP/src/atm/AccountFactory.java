package atm;

import com.shiftedtech.bank.CheckingAccount;

import bank.IAccointInfo;
import bank.IAccount;

public class AccountFactory {
	
	public static IAccount getAccount(String accountNumber) {
		
		IAccointInfo account = null;
		
		
		if(accountNumber.startsWith("123")) {
			account = new CheckingAccount(getAccountName(), accountNumber);
		}
		else if(accountNumber.startsWith("345")) {
			account = new com.paxovision.bank.CheckingAccount(getAccountName(), accountNumber);
		}
		return (IAccount) account;
		
		
	}
	
	public static String getAccountName() {
		return "Iftekhar Ivaan";
	}

}
