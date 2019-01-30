package com.shiftedtech.qa.scripts;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.framework.Assert;

public class SpreeLoginTest1 {
	private WebDriver driver= null;

	@Before
	
	public void setUp() {
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+ "\\drivers\\chromedriver.exe"));
	ChromeDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.navigate().to("http://spree.shiftedtech.com/");
	}
	
	@Test
	
	public void validloginTest() {
		String title =driver.getTitle();
		System.out.println("TITLE:-"+" "+title);
	  Assert.assertEquals( "Spree Demo Site", title);
	  WebElement element=driver.findElement(By.linkText("Login"));
	  element.click();
	  String title2=driver.getTitle();
	  System.out.println(title2);
	  Assert.assertEquals("Login - Spree Demo Site", title2);
	  
	 WebElement element3= driver.findElement(By.id("spree_user_email"));
		element3.sendKeys("shiftqa01@gmail.com");
		WebElement element4 =driver. findElement(By.id("spree_user_password"));
		element4.sendKeys("shiftedtech");
		
		
		WebElement element5=driver.findElement(By.xpath("//input[@value='Login']"));
		element5.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		WebElement element6 =driver.findElement(By.xpath("//div[@class='alert alert-success']"));
				String successmsg=element6.getText();
				System.out.println(successmsg);
				Assert.assertEquals("Logged in successfully", successmsg);
		
		
		
	}
	@Test
	public void InvalidEmail() {
		String title =driver.getTitle();
		System.out.println("TITLE:-"+" "+title);
	  Assert.assertEquals( "Spree Demo Site", title);
	  WebElement element=driver.findElement(By.linkText("Login"));
	  element.click();
	  String title2=driver.getTitle();
	  System.out.println(title2);
	  Assert.assertEquals("Login - Spree Demo Site", title2);
	  
	 WebElement element3= driver.findElement(By.id("spree_user_email"));
		element3.sendKeys("shiftqa0@gmail.com");
		WebElement element4 =driver. findElement(By.id("spree_user_password"));
		element4.sendKeys("shiftedtech");
		
		
		WebElement element5=driver.findElement(By.xpath("//input[@value='Login']"));
		element5.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		WebElement element6 =driver.findElement(By.xpath("//div[@class='alert alert-error']"));
				String successmsg=element6.getText();
				System.out.println(successmsg);
				Assert.assertEquals("Invalid email or password.", successmsg);
		
		
	}
	@Test
	public void InvalidPaaswordTest1() {
		String title =driver.getTitle();
		System.out.println("TITLE:-"+" "+title);
	  Assert.assertEquals( "Spree Demo Site", title);
	  WebElement element=driver.findElement(By.linkText("Login"));
	  element.click();
	  String title2=driver.getTitle();
	  System.out.println(title2);
	  Assert.assertEquals("Login - Spree Demo Site", title2);
	
	 WebElement element3= driver.findElement(By.id("spree_user_email"));
		element3.sendKeys("shiftqa01@gmail.com");
		WebElement element4 =driver. findElement(By.id("spree_user_password"));
		element4.sendKeys("invalid");
		
		
		WebElement element5=driver.findElement(By.xpath("//input[@value='Login']"));
		element5.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		WebElement element6 =driver.findElement(By.xpath("//div[@class='alert alert-error']"));
				String successmsg=element6.getText();
				System.out.println(successmsg);
				Assert.assertEquals("Invalid email or password.", successmsg);
		
		
		
}
	
	
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	

}
