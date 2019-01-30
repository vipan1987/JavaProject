package com.shiftedtech.java;

public class RegularExpressions {

	public static void main(String[] args) {
		
		String ans = "xight";
		String MY_PAT = "[tT]rue|[yY]es|[rR]ight";
		
		boolean isTrue = ans.contentEquals("Yes");
		System.out.println("IsTrue: " + isTrue);
		
		boolean isTrue2 = ans.matches(MY_PAT);
		System.out.println("IsTrue: " + isTrue2);
		
		String myPhone = "516-233-9988";
		String pattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
		
		System.out.println(myPhone.matches(pattern));
		
		String myEmail = "iivaan123@Gmail.com";
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
							   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		System.out.println(myEmail.matches(EMAIL_PATTERN));
		
		
		System.out.println("**************************");
		String myTest = "Iftekhar Alam Ivaan XX";
		String MY_TEST_PATTERN = "Iftekhar.*Ivaan \\D{2}";
		System.out.println("My String:" + myTest);
		System.out.println("My Pattern:" + MY_TEST_PATTERN);
		System.out.println("Pattern Match: " + myTest.matches(MY_TEST_PATTERN));
		
	}

}
