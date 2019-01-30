package com.shiftedtech.qa.shift;

import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shiftedtech.qa.shift.framework.ScriptBase;

public class ShiftButtonTest extends ScriptBase{

	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to(APP_URL + "/button");
	}
	@Test
	public void test1() {
		
		selectDropdownButtonItem(By.xpath("//button[@id='split-button-02']"),"Action");
		
		/*
		WebElement button = driver.findElement(By.xpath("//button[@id='split-button-01']"));
		WebElement dropDownButton = button.findElement(By.xpath("following-sibling::button"));
		dropDownButton.click();
		delayFor(2000);
		
		//WebElement menuItem = driver.findElement(By.xpath("//button[@id='split-button-01']/following-sibling::ul//a[(text()='Action')]"));
		//menuItem.click();
		
		/*
		List<WebElement> items = driver.findElements(By.xpath("//button[@id='split-button-01']/following-sibling::ul//a"));
		for(WebElement item : items) {
			String text = item.getText();
			if(text.contentEquals("Action")) {
				item.click();
				break;
			}
		}
		*/
		
		/*
		List<WebElement> items = dropDownButton.findElements(By.xpath("following-sibling::ul//a"));
		for(WebElement item : items) {
			String text = item.getText();
			if(text.contentEquals("Action")) {
				item.click();
				break;
			}
		}
		*/
		
		//div[@class='btn-group open']//ul[@class='dropdown-menu']//li//a[@href='#'][contains(text(),'Action')]
		//button[@id='split-button-01']/following-sibling::ul//a[contains(text(),'Action')]
		//button[@id='split-button-01']/following-sibling::ul//a[(text()='Action')]
		
		//button[@id='split-button-01']/following-sibling::ul//a[contains(text(),'Action')][1]
	//    (//button[@id='split-button-01']/following-sibling::ul//a[contains(text(),'Action')])[1]
	}
	
	public void selectDropdownButtonItem(By by, String textToMatch) {
		WebElement button = driver.findElement(by);
		if (button != null) {
			WebElement dropDownButton = button.findElement(By.xpath("following-sibling::button"));
			if (dropDownButton != null) {
				dropDownButton.click();
				delayFor(1000);
				List<WebElement> items = dropDownButton.findElements(By.xpath("following-sibling::ul//a"));
				if (items != null) {
					for (WebElement item : items) {
						String text = item.getText();
						if (text.contentEquals(textToMatch)) {
							item.click();
							break;
						}
					}
				}
			}
		}
	}
}
