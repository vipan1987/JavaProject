package com.shiftedtech.qa.scripts;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class TextBoxTest {
	private WebDriver driver = null;
	
	
	@Before
	public void setUp() {
		System.out.println("BEFORE");
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		
	}
	
	@Test
	public void test1() {
		System.out.println("TEST 1");
		driver.get("http://shifttest.shiftedtech.com/components/text_box");
		WebElement element = driver.findElement(By.id("plain-text"));
		this.typeInTextBox(element,"hello world");
		
		WebElement password = driver.findElement(By.id("password"));
		typeInTextBox(password, "vipan");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		typeInTextBox(email, "vipan@gmail.com");
	}
	
	public void typeInTextBox(WebElement element, String message) {
		element.click();
		element.clear();
		element.sendKeys(message);
	}
	
//	@Test
//	public void test2() {
//		System.out.println("TEST 2");
//		driver.get("http://shifttest.shiftedtech.com/components/radio_button");
//	}
//	
//	
//	@Test
//	public void test3() {
//		driver.navigate().to("http://shifttest.shiftedtech.com/components/text_box");
//		WebElement usernameTextbox = driver.findElement(By.xpath("//input[@id='username-text']"));
//		usernameTextbox.sendKeys("some name", Keys.TAB, "Password");
//	}
//	
//	@Test
//	public void test4() {
//		driver.navigate().to("http://shifttest.shiftedtech.com/components/text_box");
//		delayFor(5000);
//		WebElement usernameTextbox = driver.findElement(By.xpath("//input[@id='datetime-local']"));
//		usernameTextbox.sendKeys(Keys.UP, Keys.UP, Keys.TAB, Keys.DOWN, Keys.TAB, Keys.DOWN );
//	}
//	
//	@Test
//	public void test5() {
//		driver.navigate().to("http://shifttest.shiftedtech.com/components/text_box");
//		WebElement usernameTextbox = driver.findElement(By.xpath("//input[@id='date']"));
//		usernameTextbox.sendKeys("11121208");
//	}
//	

	//@After
	public void tearDown() {
		System.out.println("AFTER");
		driver.close();
		driver.quit();
	}
	
	public void delayFor(int time) {	
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
