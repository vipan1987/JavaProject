package com.shiftedtech.spree.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.shiftedtech.spree.framework.locatorkey.ISpreeObjectRepo;
import com.shiftedtech.spree.framework.pom.ApplicationController;
import com.shiftedtech.spree.framework.utils.PropertyObjectRepositoryManager;

public class StepBase implements ISpreeObjectRepo{
	protected static WebDriver driver;
	protected PropertyObjectRepositoryManager or = PropertyObjectRepositoryManager.getInstance();
	
	private ApplicationController spree = null;
	
	public ApplicationController spree() {
		if(spree == null) {
			spree = new ApplicationController(driver);
		}
		return spree;
	}
	
	public void deleteCookies() {
		//driver.manage().deleteAllCookies();
		spree().deleteAllCookies();
	}
	
	public void browserToUrl(String url) {
		//driver.navigate().to(url);
		spree().navigateTo(url);
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
	
	public void verifyPageTitle(String expectedTitle) {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, pageTitle);
	}
	
	public void verifyText(String locator, String textToVerify) {
		
		By by = getLocator(locator);
		
		WebElement element = driver.findElement(by);
		if(element != null) {
			String text = element.getText();
			Assert.assertEquals(textToVerify, text);
		}
		
	}
	
	public void delayFor(int timeInMili) {
		try {
			Thread.sleep(timeInMili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public By getLocator(String key) {
	
		By by = null;

		
		
		String locator = or.get(key);
		
		String[] locatorParts = locator.split(":=");
		if(locatorParts != null && locatorParts.length == 2) {
			String how = locatorParts[0];
			String using = locatorParts[1];
	
			if(how.equalsIgnoreCase("id")) {
				by = By.id(using);
			}
			else if(how.equalsIgnoreCase("linkText")) {
				by = By.linkText(using);
			}
			else if(how.equalsIgnoreCase("xpath")) {
				by = By.xpath(using);
			}
			else if(how.equalsIgnoreCase("cssSelector")) {
				by = By.cssSelector(using);
			}
			else if(how.equalsIgnoreCase("name")) {
				by = By.name(using);
			}
			else if(how.equalsIgnoreCase("partialLinkText")) {
				by = By.partialLinkText(using);
			}
			else if(how.equalsIgnoreCase("className")) {
				by = By.className(using);
			}
			else if(how.equalsIgnoreCase("tagName")) {
				by = By.tagName(using);
			}
		}
		
		return by;
	}
}
