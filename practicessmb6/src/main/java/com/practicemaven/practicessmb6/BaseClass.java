package com.practicemaven.practicessmb6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
public class BaseClass {
	protected WebDriver driver;
	
public BaseClass(WebDriver driver ) {
	this.driver = driver;
}
 
public void delayFor(int timeInMili) {
	try {
		Thread.sleep(timeInMili);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void verifypagetitle(String title) {
String actualtitle =driver.getTitle();
Assert.assertEquals(title, actualtitle);
	
}
}
