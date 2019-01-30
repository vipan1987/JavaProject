package com.shiftedtech.qa.framework.pom;

import org.openqa.selenium.WebDriver;

public class ApplicationController2 extends BasePage {
	
	private HomePage homePage = null;
	private LoginPage loginPage = null;
	
	public ApplicationController2(WebDriver driver) {
		super(driver);
	}
	
	public HomePage homePage() {
		if(homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}
	public LoginPage loginPage() {
		if(loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}
	

}
