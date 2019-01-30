package com.shiftedtech.qa.scripts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.requests.SortingRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ButtonTest {
private WebDriver driver = null;
	
	
	@Before
	public void setUp() {
		System.out.println("BEFORE");
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("http://shifttest.shiftedtech.com/components/button");
	}
	
	//@Ignore
	@Test
	public void test1() {
		WebElement primaryButton = driver.findElement(By.id("basic-button-01"));
		primaryButton.click();
		
		WebElement paraText= driver.findElement(By.xpath("//p[@id='alert-btn-clicked']"));
		System.out.println(paraText.getText());
		
		System.out.println("############################################");
		
		String actualResult = paraText.getText().substring(0,paraText.getText().length()-4);
		String expectedResult = "Button is clicked. You have 10 seconds to verify it.";
		//System.out.println(actual);
		
		Assert.assertEquals(expectedResult, actualResult);
		
	}
	
	
	public static void main(String[] args) {
		String info = "Hello, World";
		
		String[] strings = info.split(", ");
		
		for(int i =0; i < strings.length; i++) {
			System.out.println("String Count " + i + " " + strings[i]);
		}
		System.out.println(strings[0].length());
		System.out.println(strings[0].substring(2, strings[0].length()));
	}
	
	
	
	@After
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
