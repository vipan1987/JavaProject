package com;

public class MyStringTest {

	public static void main(String[] args) {

		String yourName = "Shehla";
		String myName = new String("Shehla");
		String ourName = "Shehla";
		
		if(yourName == myName) {
			System.out.println("Same");
		}
		
		String tmp = yourName.toUpperCase();
		printName(tmp);
			

		
	}
	
	public static void printName(String name) {
		System.out.println("Name: " + name);
	}

}
