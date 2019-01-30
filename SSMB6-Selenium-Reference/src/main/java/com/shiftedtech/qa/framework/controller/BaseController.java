package com.shiftedtech.qa.framework.controller;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BaseController {
	
	protected WebDriver driver;
	
	public BaseController(WebDriver driver) {
		this.driver = driver;
	}

	public void delayFor(int timeInMili) {
		try {
			Thread.sleep(timeInMili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void verifyPageTitle(String title) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(title, actualTitle);
	}
}
