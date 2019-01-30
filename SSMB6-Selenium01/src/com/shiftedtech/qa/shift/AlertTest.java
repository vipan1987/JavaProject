package com.shiftedtech.qa.shift;

import javax.swing.text.Position.Bias;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import com.shiftedtech.qa.shift.framework.ScriptBase;

public class AlertTest extends ScriptBase{

	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to(APP_URL + "/alert");
	}
	
	@Test
	public void test1() {
		WebElement alert1 = driver.findElement(By.id("alert-01"));
		alert1.click();
		
		delayFor(3000);
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text: " + alertText);
		
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void test2() {
		WebElement alert1 = driver.findElement(By.id("alert-02"));
		alert1.click();
		
		delayFor(3000);
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text: " + alertText);
		
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void test3() {
		WebElement alert1 = driver.findElement(By.id("alert-03"));
		alert1.click();
		
		delayFor(3000);
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text: " + alertText);
		
		driver.switchTo().alert().sendKeys("I am typing in Alert textbox");
		
		delayFor(2000);
		driver.switchTo().alert().accept();
	}
}
