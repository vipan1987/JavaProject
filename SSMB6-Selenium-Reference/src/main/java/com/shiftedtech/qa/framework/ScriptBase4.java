package com.shiftedtech.qa.framework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shiftedtech.qa.framework.utils.DriverUtil;
import com.shiftedtech.qa.framework.utils.WebElementUtil;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ScriptBase4  implements ISpreeObjectRepo {

	protected WebDriver driver;
	protected WebElementUtil webElement;
	protected DriverUtil driverUtil;
	
	@Before
	public void setUp() {	
		//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		webElement = new WebElementUtil(driver);
		driverUtil = new DriverUtil(driver);
		
		
		//driver.get("http://spree.shiftedtech.com/");
		driver.navigate().to("http://spree.shiftedtech.com/");
	}
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
