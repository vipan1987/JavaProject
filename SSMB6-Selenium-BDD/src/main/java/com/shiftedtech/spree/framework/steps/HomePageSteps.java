package com.shiftedtech.spree.framework.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends StepBase {

	@Then("Spree home page should display")
	public void spree_home_page_should_display() {
		spree().homePage().verifyPageTitle("Spree Demo Site");
		
		//verifyPageTitle("Spree Demo Site");
		
		//String title = driver.getTitle();
	    //Assert.assertEquals("Spree Demo Site",title);
	}
	
	@When("User click login link")
	public void user_click_login_link() {
		spree().homePage().goToLoginPage();
		//click(HomePage_LoginLink);
	    //driver.findElement(By.linkText("Login")).click();
	}
	
	@Then("Home page should display")
	public void home_page_should_display() {
		spree().homePage().verifyPageTitle("Spree Demo Site");
		//verifyPageTitle("Spree Demo Site");
	    //String title = driver.getTitle();
	    //Assert.assertEquals("Spree Demo Site",title);
	}
	
	@Then("Login success message display")
	public void login_success_message_display() {
		spree().homePage().verifySuccessMsg("Logged in successfully");
		//verifyText(HomePage_SuccessMessage, "Logged in successfully");
	    //String msg = driver.findElement(By.cssSelector("div.alert.alert-success")).getText();
	    // Assert.assertEquals("Logged in successfully",msg);
	}
}
