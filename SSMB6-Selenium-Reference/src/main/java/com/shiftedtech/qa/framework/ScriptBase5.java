package com.shiftedtech.qa.framework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shiftedtech.qa.SpreeLoginTest1;
import com.shiftedtech.qa.framework.pom.ApplicationController;
import com.shiftedtech.qa.framework.pom.ApplicationController2;
import com.shiftedtech.qa.framework.utils.DriverUtil;
import com.shiftedtech.qa.framework.utils.WebElementUtil;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ScriptBase5{
	protected WebDriver driver;
	private ApplicationController2 spree;

	
	@Before
	public void setUp() {	

		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		spree = new ApplicationController2(driver);
		
		//driver.get("http://spree.shiftedtech.com/");
		driver.navigate().to("http://spree.shiftedtech.com/");
	}
	
	public ApplicationController2 spree() {
		return spree;
	}
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		spree = null;
	}
}
