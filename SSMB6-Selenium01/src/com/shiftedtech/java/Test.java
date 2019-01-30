package com.shiftedtech.java;

public class Test {

	public static void main(String[] args) {
		
		String myTest = "Test99Yes";
		System.out.println(myTest.matches("Test\\d{1,2}Yes"));

		//printEmil("iivaan@gmail.com");
	
		try {
			printEmil(new EmailAddress("iivaangmail.com"));
		}
		catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("This is runtime exception");
		}
		
		
	}
	
	public static void printEmil(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if(email.matches(EMAIL_PATTERN)) {
		System.out.println("Email: " + email);
		}
		else {
			System.out.println("Invalid Email");
		}
	}
	public static void printEmil(EmailAddress email) {
		
		System.out.println("Email: " + email.value());
		
	}


}
