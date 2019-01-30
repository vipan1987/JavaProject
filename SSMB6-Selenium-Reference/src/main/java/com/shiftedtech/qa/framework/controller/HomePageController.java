package com.shiftedtech.qa.framework.controller;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageController extends BaseController{

	public HomePageController(WebDriver driver) {
		super(driver);
	}
	
	public void goToLoginPage() {
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
	}
	
	public void verifySuccessMsg(String msg) {
		WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		String successText = successMsg.getText();
		Assert.assertEquals(msg, successText);
	}
	public void verifySuccessMsg() {
		verifySuccessMsg("Logged in successfully");
	}
	
	public void verifyPageTitle() {
		super.verifyPageTitle("Spree Demo Site");
	}

}
