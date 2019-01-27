package com.practicemaven.practicessmb6;

import org.openqa.selenium.WebDriver;

public class ApplicationController extends BaseClass{
private HomePage homePage;
private LoginPage loginpage;

public ApplicationController(WebDriver driver) {
	super(driver );
	homePage=new HomePage(driver);
	loginpage =new LoginPage(driver);
}
public HomePage homepage() {
	return homePage;
}
public  LoginPage loginpage() {
	return loginpage;
	
}	
	
	
}
