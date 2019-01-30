package com.shiftedtech.qa;
import org.junit.Test;
import com.shiftedtech.qa.framework.ScriptBase;
import com.shiftedtech.qa.framework.utils.ExcelReader;

public class SpreeLoginTest2 extends ScriptBase{
	
	
	@Test
	public void validLogin() {
		verifyPageTitle("Spree Demo Site");
		click("linkText:=Login");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("id:=spree_user_email","shiftqa01@gmail.com");
		enterText("id:=spree_user_password","shiftedtech");
		click("xpath:=//input[@value='Login']");
		delayFor(3000);
		verifyPageTitle("Spree Demo Site");
		verifyText("xpath:=//div[@class='alert alert-success']","Logged in successfully");
	}
	
	@Test
	public void invalidPasswordLogin() {
		verifyPageTitle("Spree Demo Site");
		click("linkText:=Login");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("id:=spree_user_email","shiftqa01@gmail.com");
		enterText("id:=spree_user_password","invalid");
		click("xpath:=//input[@value='Login']");
		delayFor(3000);
		verifyPageTitle("Login - Spree Demo Site");
		verifyText("xpath:=//div[@class='alert alert-error']","Invalid email or password.");
			
	}
	
	@Test
	public void invalidEmailLogin() {
		verifyPageTitle("Spree Demo Site");
		click("linkText:=Login");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("id:=spree_user_email","shiftqa01xxx@gmail.com");
		enterText("id:=spree_user_password","shiftedtech");
		click("xpath:=//input[@value='Login']");
		delayFor(3000);
		verifyPageTitle("Login - Spree Demo Site");
		verifyText("xpath:=//div[@class='alert alert-error']","Invalid email or password.");
		
	}
	
	
	

}
