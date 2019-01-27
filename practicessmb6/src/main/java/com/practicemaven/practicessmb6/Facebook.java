package com.practicemaven.practicessmb6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.framework.Assert;

public class Facebook {
	private WebDriver driver = null;
	 //WebDriver driver = null;
	@Before
	public void setUp() {	
		//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("http://spree.shiftedtech.com/");
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@Test
	public void validLogin() {
		String homePageTitle = driver.getTitle();
		System.out.println(homePageTitle);
	Assert.assertEquals("Facebook - Log In or Sign Up",homePageTitle);
	//WebElement loginLink=driver.findElement(By.className("login_page "));
WebElement loginLink=driver.findElement(By.id("u_0_2"));
	loginLink.click();
	
	WebElement emailLink=driver.findElement(By.id("email"));
	emailLink.sendKeys("vipan1987@yahoo.com");
	
	WebElement passwordLink=driver.findElement(By.id("pass"));
	passwordLink.click();
	passwordLink.sendKeys("Prince1984");
	//String loginLinkTitle=driver.getTitle();
	//System.out.println(loginLinkTitle);
	//Assert.assertEquals("facebook",homePageTitle);
	WebElement login=driver.findElement(By.id("loginbutton"));
	login.click();
	
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
}


