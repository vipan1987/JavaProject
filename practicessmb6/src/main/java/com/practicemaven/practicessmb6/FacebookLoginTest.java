package com.practicemaven.practicessmb6;

import org.junit.Test;

public class FacebookLoginTest extends FacebookBaseAction  {
	
	@Test
	public void validLogin() {
		verifyPageTitle("Facebook - Log In or Sign Up");
		//u_0_2
		//click("id:=u_0_2");
		click("Homepage.Loginlink");
		//verifyPageTitle("Login - Spree Demo Site");
		//email/pass
		//enterText("id:=email","vipan1987@yahoo.com");
		enterText("Loginpage.Emailtextbox","vipan1987@yahoo.com");
		//enterText("id:=pass","Prince1984");
		enterText("Loginpage.Passwordtextbox","Prince1984");
		//loginbutton
		//click("id:=loginbutton");
		click("Loginpage.Loginbutton");
		delayFor(3000);
		//verifyPageTitle("Spree Demo Site");
		//verifyText("xpath:=//div[@class='alert alert-success']","Logged in successfully");
	}
}
