package com.shiftedtech.qa.framework.controller;

import org.openqa.selenium.WebDriver;

public class ApplicationController extends BaseController {
	
	private HomePageController homePage;
	private LoginPageController loginPage;
	
	public ApplicationController(WebDriver driver) {
		super(driver);
		homePage = new HomePageController(driver);
		loginPage = new LoginPageController(driver);
	}
	
	public HomePageController homePage() {
		return homePage;
	}
	public LoginPageController loginPage() {
		return loginPage;
	}
	

}
