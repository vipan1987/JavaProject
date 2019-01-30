package com.shiftedtech.qa.framework.utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtil extends DriverBase {
	
	public WebElementUtil(WebDriver driver) {
		super(driver);
	}

	public void click(String locator) {
		
		By by = getLocator(locator);
		
		if(by != null) {
			WebElement element = driver.findElement(by);
				if(element != null) {
					element.click();
			}
		}
	}
	
	public void enterText(String locator, CharSequence textToType) {
		
		By by = getLocator(locator);
		
		if(by != null) {
			WebElement element = driver.findElement(by);
				if(element != null) {
					element.sendKeys(textToType);;
			}
		}
		
	}
	
	public void verifyText(String locator, String textToVerify) {
		
		By by = getLocator(locator);
		
		WebElement element = driver.findElement(by);
		if(element != null) {
			String text = element.getText();
			Assert.assertEquals(textToVerify, text);
		}
		
	}
}
