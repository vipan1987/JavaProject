package com.practicemaven.practicessmb6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class SpreeLogin extends ScriptBase {
	@Test
	public void validLoginTest() {
		spree().homepage().verifypagetitle("Spree Demo Site");
		spree().homepage().gotoLoginPage();
	
		spree().loginpage().verifypagetitle("Login - Spree Demo Site");
		spree().loginpage().login("shiftqa01@gmail.com", "shiftedtech");
		
		spree().homepage().successMsg("Logged in successfully");	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@After
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
