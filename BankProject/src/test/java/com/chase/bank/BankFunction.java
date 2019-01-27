package com.chase.bank;

import org.omg.CORBA.PUBLIC_MEMBER;

public class BankFunction {
	
		private int depositeAmount;
		
		public int getAmount() {
			return depositeAmount;
		}
	public void setAmount(int depositeAmount) {
		
		this.depositeAmount = depositeAmount;
		
	}
	public static void main(String[] args) {
		
		BankFunction amount=new BankFunction();
		amount.setAmount(2000);
		int a = amount.getAmount();
		System.out.println(a);
		
		
	
	}
}













