package com.shiftedtech.qa.scripts;

import java.util.concurrent.BlockingDeque;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.ChromeDriverManager;

	public class BaseAction1 {
	private WebDriver driver =null;
	@Before
		
		public void setUp() {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+ "\\drivers\\chromedriver.exe"));
		ChromeDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("http://spree.shiftedtech.com/");
		}
		@Test
		public void login() {
			click("linktext:=Login");
		}
		public void click(String locator ) {
			By by=null;
		
			//now i need to convert this text (By.linkText("Login") to colinical means ("linktext:=Login")
			String[] locatorparts =locator.split(":=");
			String how =locatorparts[0];
			String using=locatorparts[1];
			if (how.equalsIgnoreCase("linkText")) {
				
			
				by= By.linkText(using);
			}if (by !=null) {
			WebElement element=driver.findElement(by);
			if (element!=null) {
			  element.click();	
		   }
		 }
		}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	}
