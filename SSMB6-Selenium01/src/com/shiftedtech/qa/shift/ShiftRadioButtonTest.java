package com.shiftedtech.qa.shift;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.shiftedtech.qa.shift.framework.ScriptBase;

public class ShiftRadioButtonTest extends ScriptBase{

	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to(APP_URL + "/radio_button");
	}
	
	@Test
	public void test1() {
		WebElement maleRadioButton = driver.findElement(By.id("male"));
		maleRadioButton.click();
		delayFor(1000);
		
		String value = maleRadioButton.getAttribute("checked");
		System.out.println(value);
//		
//		boolean isSelected2;
//		if(value != null && value.contentEquals("true")) {
//			isSelected2 = true;
//		}
//		else
//		{
//			isSelected2 = false;
//		}
//		
		//boolean isSelected2 = value != null && value.contentEquals("true") ? true : false;
		//String isSelected3 = value != null && value.contentEquals("true") ? "Yes" : "No";
		
		//System.out.println(isSelected2);
		
		//boolean isSelected = maleRadioButton.isSelected();
		//System.out.println(isSelected);
		
	}
	
	/*@Test
	public void test2() {
		WebElement maleRadioButton = driver.findElement(By.id("male"));
		if(!maleRadioButton.isSelected()) {
			//maleRadioButton.click();
		}
		delayFor(1000);
		
		boolean isSelected = maleRadioButton.isSelected();
		System.out.println(isSelected);
		Assert.assertTrue(isSelected);
	}
	
	

	@Test
	public void test3() {
		selectRadioButton("Male");
		delayFor(4000);
		selectRadioButton("Female");
	
	}
	
	@Test
	public void test4() {
		selectBootstrapRadioButton("Option 1");
		delayFor(4000);
		selectBootstrapRadioButton("Option 2");
	
	}
	
	
	public void selectRadioButton(String lable) {
		//WebElement radioButton = driver.findElement(By.xpath("//label[contains(text(),'Male')]/preceding-sibling::input"));
		WebElement radioButton = driver.findElement(By.xpath("//label[contains(text(),'" + lable + "')]/preceding-sibling::input[1]"));
		if(!radioButton.isSelected()) {
			radioButton.click();
		}
	}
	public void selectBootstrapRadioButton(String lable) {
		//WebElement radioButton = driver.findElement(By.xpath("//div[@id='css-radio-btn-01']//label[contains(text(),'Option 1')]/input"));
		WebElement radioButton = driver.findElement(By.xpath("//div[@id='css-radio-btn-01']//label[contains(text(),'" + lable + "')]/input"));
		if(!radioButton.isSelected()) {
			radioButton.click();
		}
	}*/
}
