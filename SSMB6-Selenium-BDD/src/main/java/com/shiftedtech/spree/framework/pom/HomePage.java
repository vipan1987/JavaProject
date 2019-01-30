package com.shiftedtech.spree.framework.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	@FindBy(linkText="Login")
	private WebElement loginLink;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successMsg;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void goToLoginPage() {
		loginLink.click();
	}
	
	public void verifySuccessMsg(String msg) {
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
