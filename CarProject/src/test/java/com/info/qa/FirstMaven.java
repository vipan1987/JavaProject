package com.info.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FirstMaven {
	
	public WebDriver driver=null;
	
	
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().arch32().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://shifttest.shiftedtech.com/components");
		driver.manage().window().maximize();
	}
	
	/*@Test
	public void test() {
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	@After
	public void tearDown() {
		//driver.close();
		//driver.quit();
		
	}*/
	public void delayFor(int timeinMilli) {
		try {
			Thread.sleep(timeinMilli);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
