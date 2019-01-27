package com.practicemaven.practicessmb6;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ScriptBase {
	protected WebDriver driver;
	private ApplicationController spree;

	
	@Before
	public void setUp() {	

		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		spree = new ApplicationController(driver);
		
		//driver.get("http://spree.shiftedtech.com/");
		driver.navigate().to("http://spree.shiftedtech.com/");
	}
	
	public ApplicationController spree() {
		return spree;
	}
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		spree = null;
	}
}

