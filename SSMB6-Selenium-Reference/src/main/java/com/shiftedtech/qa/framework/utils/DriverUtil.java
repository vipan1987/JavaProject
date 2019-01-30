package com.shiftedtech.qa.framework.utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DriverUtil extends DriverBase{

	public DriverUtil(WebDriver driver) {
		super(driver);
	}

	public void verifyPageTitle(String expectedTitle) {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, pageTitle);
	}
}
