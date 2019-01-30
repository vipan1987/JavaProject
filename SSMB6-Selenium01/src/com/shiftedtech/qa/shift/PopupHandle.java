package com.shiftedtech.qa.shift;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shiftedtech.qa.shift.framework.ScriptBase;

public class PopupHandle extends ScriptBase{

	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to("https://www.saksfifthavenue.com/Entry.jsp");
	}
	@Test
	public void test1() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		WebElement newLetterDialog = null;
		
		try {
			newLetterDialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='generic-modal']")));
		} catch (Exception e) {
			System.out.println("Continue ...");
		}
		
		if(newLetterDialog != null) {
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@src,'ML1145Acollect.jsp')][1]"));
			driver.switchTo().frame(iframe);
			
			WebElement closeButton = driver.findElement(By.xpath(".//*[@id='close-button']"));
			closeButton.click();
		}
		
	}
}
