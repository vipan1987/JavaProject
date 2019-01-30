package com.shiftedtech.qa.framework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shiftedtech.qa.framework.utils.ExcelObjectRepositoryManager;
import com.shiftedtech.qa.framework.utils.PropertyObjectRepositoryManager;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ScriptBase2 implements ISpreeObjectRepo {

	protected WebDriver driver = null;
	
	
	@Before
	public void setUp() {	
		//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("http://spree.shiftedtech.com/");
		driver.navigate().to("http://spree.shiftedtech.com/");
	}
	
	public void browserToUrl(String url) {
		driver.navigate().to(url);
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
					element.sendKeys(textToType);
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

		//PropertyObjectRepositoryManager xxx = new PropertyObjectRepositoryManager();
		PropertyObjectRepositoryManager or = PropertyObjectRepositoryManager.getInstance();
		//ExcelObjectRepositoryManager or = ExcelObjectRepositoryManager.getInstance();
		
		
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
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
