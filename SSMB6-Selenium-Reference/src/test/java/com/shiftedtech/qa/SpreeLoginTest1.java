package com.shiftedtech.qa;

import java.sql.Driver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SpreeLoginTest1 {
	
	private WebDriver driver = null;
	
	@Before
	public void setUp() {	
		//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("http://spree.shiftedtech.com/");
		driver.navigate().to("http://spree.shiftedtech.com/");
	}
	
	@Test
	public void validLogin() {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("Spree Demo Site", homePageTitle);
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login - Spree Demo Site", loginPageTitle);
		
		
		WebElement emailTextbox = driver.findElement(By.id("spree_user_email"));
		if(emailTextbox != null) {
			emailTextbox.clear();
			emailTextbox.sendKeys("shiftqa01@gmail.com");
		}
		else {
			System.out.println("Element not found");
		}
		
		WebElement passwordTextbox = driver.findElement(By.id("spree_user_password"));
		passwordTextbox.sendKeys("shiftedtech");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		homePageTitle = driver.getTitle();
		Assert.assertEquals("Spree Demo Site", homePageTitle);
		
		WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		String successText = successMsg.getText();
		Assert.assertEquals("Logged in successfully", successText);
		
	}
	
	@Test
	public void invalidPasswordLogin() {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("Spree Demo Site", homePageTitle);
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login - Spree Demo Site", loginPageTitle);
		
		
		WebElement emailTextbox = driver.findElement(By.id("spree_user_email"));
		emailTextbox.sendKeys("shiftqa01@gmail.com");
		
		WebElement passwordTextbox = driver.findElement(By.id("spree_user_password"));
		passwordTextbox.sendKeys("invalid");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login - Spree Demo Site", loginPageTitle);
		
		WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
		String successText = successMsg.getText();
		Assert.assertEquals("Invalid email or password.", successText);
		
	}
	
	@Test
	public void invalidEmailLogin() {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("Spree Demo Site", homePageTitle);
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login - Spree Demo Site", loginPageTitle);
		
		
		WebElement emailTextbox = driver.findElement(By.id("spree_user_email"));
		emailTextbox.sendKeys("shiftqa01xxx@gmail.com");
		
		WebElement passwordTextbox = driver.findElement(By.id("spree_user_password"));
		passwordTextbox.sendKeys("shiftedtech");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login - Spree Demo Site", loginPageTitle);
		
		WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
		String successText = successMsg.getText();
		Assert.assertEquals("Invalid email or password.", successText);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
