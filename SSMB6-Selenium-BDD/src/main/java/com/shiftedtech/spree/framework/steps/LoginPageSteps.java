package com.shiftedtech.spree.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends StepBase{
	@Then("Browser display Login page")
	public void browser_display_Login_page() {
		spree().loginPage().verifyPageTitle("Login - Spree Demo Site");
		//verifyPageTitle("Login - Spree Demo Site");
	    //String title = driver.getTitle();
	    //Assert.assertEquals("Login - Spree Demo Site", title);
	}
	
	@When("User enter user email as {string}")
	public void user_enter_user_email_as(String email) {
		spree().loginPage().enterEmailAddress(email);
		//enterText(LoginPage_EmailTextbox, email);
	    // driver.findElement(By.id("spree_user_email")).sendKeys(email);
	}
	
	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String string) {
		spree().loginPage().enterPassword(string);
		//enterText(LoginPage_Passwordtextbox, string);
	    //driver.findElement(By.id("spree_user_password")).sendKeys(string);
	}
	
	@When("User click login button")
	public void user_click_login_button() {
		spree().loginPage().clickLoginButton();
		//click(LoginPage_LoginButton);
	    //driver.findElement(By.name("commit")).click();
		//delayFor(2000);
	    /*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}*/
	}
	

	@Then("Login not success message display")
	public void login_not_success_message_display() {
		spree().loginPage().verifyErrorMsg("Invalid email or password.");
		//verifyText(LoginPage_ErrorMessage, "Invalid email or password.");
	    //String msg = driver.findElement(By.cssSelector("div.alert.alert-error")).getText();
	    //Assert.assertEquals("Invalid email or password.",msg);
	}
}
