package com.shiftedtech.java;

public class EmailAddress {
	
	private String email = null;
	private final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public EmailAddress(String email) throws InvalidEmailException  {
		if(email.matches(EMAIL_PATTERN))
		{
			this.email = email;
		}
		else {
			//System.out.println("Invalid email address: " + email);
			//throw new RuntimeException("Invalid email address: " + email);
			throw new InvalidEmailException("Invalid email address: " + email);
		}
	}

	public String value() {
		return email;
	}
	
}
