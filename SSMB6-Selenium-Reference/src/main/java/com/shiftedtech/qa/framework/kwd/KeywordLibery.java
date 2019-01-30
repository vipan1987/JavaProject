package com.shiftedtech.qa.framework.kwd;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeywordLibery {
	private WebDriver driver = null;
	
	public KeywordLibery(WebDriver driver) {
		this.driver = driver;
	}

	
	public void browserToUrl(String url) {
		driver.navigate().to(url);
	}
	
	public void click(String locator) {
		By by = getLocator(locator);
		WebElement element = driver.findElement(by);
		element.click();
	}
	public void inputText(String locator, String text) {
		By by = getLocator(locator);
		WebElement element = driver.findElement(by);
		element.sendKeys(text);
	}
	public void verifyText(String locator, String expectedText) {
		By by = getLocator(locator);
		WebElement element = driver.findElement(by);
		
		String actualText = element.getText();
		
		Assert.assertEquals(expectedText, actualText);
	}
	public void delayFor(int timeToDelay) {
		try {
			Thread.sleep(timeToDelay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public By getLocator(String locator) {
		By by = null;
		String locatorBy = locator.split(":=")[0];
		String locatorUsing = locator.split(":=")[1];
		
		if(locatorBy == null || locatorBy.length() == 0) {
			System.out.println("Locator by was not found");
		}
		if(locatorUsing == null || locatorUsing.length() == 0) {
			System.out.println("Locator using  was not found");
		}
		
		if(locatorBy.trim().toUpperCase().contentEquals("ID")) {
			by = By.id(locatorUsing);
		}
		else if(locatorBy.trim().toUpperCase().contentEquals("NAME")) {
			by = By.name(locatorUsing);
		}
		else if(locatorBy.trim().toUpperCase().contentEquals("XPATH")) {
			by = By.xpath(locatorUsing);
		}
		else if(locatorBy.trim().toUpperCase().contentEquals("CSS")) {
			by = By.cssSelector(locatorUsing);
		}
		else if(locatorBy.trim().toUpperCase().contentEquals("LINKTEXT")) {
			by = By.linkText(locatorUsing);
		}
		else if(locatorBy.trim().toUpperCase().contentEquals("PERTIALLINKTEXT")) {
			by = By.partialLinkText(locatorUsing);
		}
		else if(locatorBy.trim().toUpperCase().contentEquals("TAGNAME")) {
			by = By.tagName(locatorUsing);
		}
		else if(locatorBy.trim().toUpperCase().contentEquals("CLASSNAME")) {
			by = By.className(locatorUsing);
		}
		return by;
	}
}
