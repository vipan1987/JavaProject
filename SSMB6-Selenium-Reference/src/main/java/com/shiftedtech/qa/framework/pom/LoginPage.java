package com.shiftedtech.qa.framework.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String email, String password) {
		WebElement emailTextbox = driver.findElement(By.id("spree_user_email"));
		emailTextbox.sendKeys(email);
		
		WebElement passwordTextbox = driver.findElement(By.id("spree_user_password"));
		passwordTextbox.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		delayFor(2000);
	}
	
	public void verifyErrorMsg(String msg) {
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
		String errorText = errorMsg.getText();
		Assert.assertEquals(msg, errorText);
	}
	
	public void verifyPageTitle() {
		super.verifyPageTitle("Login - Spree Demo Site");
	}
}
