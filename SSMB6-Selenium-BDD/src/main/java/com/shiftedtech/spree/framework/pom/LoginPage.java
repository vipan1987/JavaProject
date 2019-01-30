package com.shiftedtech.spree.framework.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	@FindBy(id="spree_user_email")
	private WebElement emailTextbox;
	@FindBy(id="spree_user_password")
	private WebElement passwordTextbox;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath="//div[@class='alert alert-error']")
	//we say object repository but here we call page object model repository
	private WebElement errorMsg;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterEmailAddress(String email) {
		emailTextbox.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordTextbox.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
		delayFor(2000);
	}
	
	public void login(String email, String password) {
		enterEmailAddress(email);
		enterPassword(password);
		clickLoginButton();
	}
	
	public void verifyErrorMsg(String msg) {
		String errorText = errorMsg.getText();
		Assert.assertEquals(msg, errorText);
	}
	
	public void verifyPageTitle() {
		super.verifyPageTitle("Login - Spree Demo Site");
	}
}
