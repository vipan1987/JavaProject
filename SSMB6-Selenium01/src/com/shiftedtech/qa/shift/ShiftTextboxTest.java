package com.shiftedtech.qa.shift;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.shiftedtech.qa.shift.framework.ScriptBase;

public class ShiftTextboxTest extends ScriptBase {


	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to(APP_URL + "/text_box");
	}
	
	@Test
	public void test1() {
		WebElement element = driver.findElement(By.id("username-text"));
		element.sendKeys("iivaan");
		delayFor(5000);
	}

	@Test
	public void test2() {
		WebElement element = driver.findElement(By.id("password-text"));
		element.sendKeys("shiftedtech");
		delayFor(5000);
	}
	
	@Test
	public void dateTest3() {
		WebElement element = driver.findElement(By.id("date"));
		element.sendKeys("09082018");
		delayFor(5000);
	}
	@Test
	public void numberTest3() {
		WebElement element = driver.findElement(By.id("number"));
		element.sendKeys("2");
		delayFor(5000);
		element.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP);
		delayFor(5000);
		element.sendKeys(Keys.ARROW_DOWN);
		delayFor(5000);
		
		
	}
	
	@Test
	public void dateTimeLocalTest3() {
		WebElement element = driver.findElement(By.id("datetime-local"));
		delayFor(1000);
		Dimension d = element.getSize();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element, d.getWidth() - 5, d.getHeight()/2)
		       .click()
		       .build()
		       .perform();
		
		delayFor(50000);
		
	}
	

	
}
