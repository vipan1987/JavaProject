package com.info.junit.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTest {
	public static WebDriver driver=null;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class method");
//		WebDriverManager.chromedriver().arch32().setup();
//		driver = new ChromeDriver();
//		driver.get("http://www.google.com");
	}
	@Before
	public void setUp() {
		System.out.println("before method");
		WebDriverManager.chromedriver().arch32().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
	}
	@Test
	public void test1() {
		System.out.println("test1 method");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
	@Test
	public void test2() {
		System.out.println("test2 method");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void test3() {
		System.out.println("test3 method");
		WebElement searchBox = driver.findElement(By.name("q"));
		sendMessage(searchBox, "salman khan");
		
	}
	@Test
	public void test4() {
		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.click();
//		searchBox.clear();
//		searchBox.sendKeys("salmankhan");
		sendMessage(searchBox, "virat kohli");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		WebElement googleSearch = driver.findElement(By.name("btnK"));
		//googleSearch.click();
		clickElement(googleSearch);
	}
	public void sendMessage(WebElement element, String message) {
		element.click();
		element.clear();
		element.sendKeys(message);
	}
	public void clickElement(WebElement element) {
		element.click();
	}
	@After
	public void tearDown() {
		System.out.println("after method");
		driver.close();
		driver.quit();
		
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after class method");
//		driver.close();
//		driver.quit();
		
	}

}
