package com.shiftedtech.qa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeatclinicLoginTest {
	
	private WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://heatclinic.shiftedtech.com/");
	}
	
	@Test
	public void validUserValidPassword() {
		
		//driver.findElement(By.linkText("Login")).click();
		
		By loginLocator =  new By.ByLinkText("Login");
		//By loginLocator =  By.linkText("Login");
		WebElement loginLink = driver.findElement(loginLocator);
		driver = null;
		
		loginLink.click();
		
		
		
		WebElement userTextbox = driver.findElement(By.name("j_username"));
		userTextbox.click();
		userTextbox.clear();
		userTextbox.sendKeys("shiftqa01@gmail.com");
		
		
		driver.findElement(By.name("j_password")).clear();
		driver.findElement(By.name("j_password")).sendKeys("shiftedtech");
		
		driver.findElement(By.cssSelector("input.login_button")).click();
		
		WebElement myAccount = driver.findElement(By.cssSelector(".my-account"));
		String myText = myAccount.getText();
		
		System.out.println("My Account: " + myText);
		Assert.assertEquals("Shift",myText);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
