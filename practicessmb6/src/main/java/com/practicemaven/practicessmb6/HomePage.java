package com.practicemaven.practicessmb6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver ) {
		super(driver );
		
		
	}
	
	
	public void gotoLoginPage() {
		
		WebElement loginPage=driver.findElement(By.linkText("Login"));
		loginPage.click();
		
	}
	public void successMsg(String msg) {
		WebElement successmsg= driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		
		String gettext = successmsg.getText();
		Assert.assertEquals(msg, gettext);
	}
	public void verifySuccessMsg() {
		successMsg("Logged in successfully");
	}
	public void homepageTitle() {
		verifypagetitle("Spree Demo Site");
	}
	
	
	

}
