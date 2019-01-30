package com.shiftedtech.spree.framework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BasicSteps extends StepBase {

	@Given("Not a validated user")
	public void not_a_validated_user() {
		deleteCookies();
		//driver.manage().deleteAllCookies();
	}
	
	@When("User browse to the site")
	public void user_browse_to_the_site() {
		//driver.navigate().to("http://spree.shiftedtech.com");
		browserToUrl("http://spree.shiftedtech.com");
	}
}
