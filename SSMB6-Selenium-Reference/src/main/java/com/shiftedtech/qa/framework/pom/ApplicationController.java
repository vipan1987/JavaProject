package com.shiftedtech.qa.framework.pom;

import org.openqa.selenium.WebDriver;

public class ApplicationController extends BasePage {
	
	private HomePage homePage;
	private LoginPage loginPage;
	
	public ApplicationController(WebDriver driver) {
		super(driver);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}
	
	public HomePage homePage() {
		return homePage;
	}
	public LoginPage loginPage() {
		return loginPage;
	}
	

}
