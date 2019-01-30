package com.shiftedtech.qa;

public class TestDriver {

	public static void main(String[] args) {
		HeatclinicLoginTest htTest = new HeatclinicLoginTest();
		htTest.setUp();
		htTest.validUserValidPassword();
		htTest.tearDown();
	}

}
