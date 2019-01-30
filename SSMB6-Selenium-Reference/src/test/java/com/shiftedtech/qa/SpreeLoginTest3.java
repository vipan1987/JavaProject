package com.shiftedtech.qa;

import com.shiftedtech.qa.framework.ScriptBase;

public class SpreeLoginTest3 extends ScriptBase{
	
	public void invalidUserInvalidPassword() {
		verifyPageTitle("Spree Demo Site");
		click("linkText:=Login");
		verifyPageTitle("Login - Spree Demo Site");
		enterText("id:=spree_user_email","shiftqa01xxx@gmail.com");
		enterText("id:=spree_user_password","invalid");
		click("xpath:=//input[@value='Login']");
		delayFor(3000);
		verifyPageTitle("Login - Spree Demo Site");
		verifyText("xpath:=//div[@class='alert alert-error']","Invalid email or password.");
		
	}

}
