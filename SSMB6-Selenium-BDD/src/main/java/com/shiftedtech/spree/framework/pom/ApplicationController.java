package com.shiftedtech.spree.framework.pom;

import org.openqa.selenium.WebDriver;

public class ApplicationController extends BasePage {
	
	private HomePage homePage = null;
	private LoginPage loginPage = null;
	
	public ApplicationController(WebDriver driver) {
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
	
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

}
