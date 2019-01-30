package com.shiftedtech.qa.framework.utils;

import org.openqa.selenium.WebDriver;

public class DriverBase  extends LocatorUtil{
	protected WebDriver driver = null;
	
	public DriverBase(WebDriver driver) {
		this.driver = driver;
	}
	
	public void delayFor(int timeInMili) {
		try {
			Thread.sleep(timeInMili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
