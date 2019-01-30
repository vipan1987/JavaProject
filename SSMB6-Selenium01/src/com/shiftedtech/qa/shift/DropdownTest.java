package com.shiftedtech.qa.shift;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.shiftedtech.qa.shift.framework.ScriptBase;

public class DropdownTest extends ScriptBase{

	@Override
	@Before
	public void setUp() {
		super.setUp();
		driver.navigate().to(APP_URL + "/dropdown_menu");
	}
	
	@Test
	public void test1() {
		WebElement element = driver.findElement(By.xpath("//div[@id='html-select-01']//select"));
		
		Select select = new Select(element);
		//select.selectByVisibleText("Option 2");
		//select.selectByIndex(3);
		//select.selectByValue("Option 3");
		
		WebElement element2  = driver.findElement(By.xpath("//select[@name='decision2']"));
		Select listBox = new Select(element2);
		listBox.selectByVisibleText("Plan 2");
		//delayFor(5000);
		//listBox.deselectByVisibleText("Plan 2");
		
		WebElement element3 = driver.findElement(By.xpath("//div[@id='html-select-03']//select"));
		Select multySelect = new Select(element3);
		multySelect.selectByVisibleText("Option 2");
		multySelect.selectByVisibleText("Option 3");
		delayFor(5000);
		multySelect.deselectByVisibleText("Option 2");
		
		List<WebElement> optionList = multySelect.getOptions();
		assertEquals(4, optionList.size());
		
		String[] actualItems = new String[optionList.size()];
		for(int i = 0; i < optionList.size(); i++) {
			String text = optionList.get(i).getText();
			System.out.println(text);
			actualItems[i] = text;
		}
		
		String[] expectedItems = {"Option 1","Option 5","Option 3","Option 4"};
		
		assertArrayEquals(expectedItems, actualItems);
		
		
		
	}
	
	@Test
	public void test2() {
		
		driver.manage().window().maximize();
		
		WebElement dropDownButton = driver.findElement(By.id("dropdown-menu-basic"));
		dropDownButton.click();
		
		List<WebElement> listItems = dropDownButton.findElements(By.xpath("../ul/li/a"));
		System.out.println("List count: " + listItems.size());
		for(int i = 0; i < listItems.size(); i++) {
			String text = listItems.get(i).getText();
			System.out.println("Item: " + text);
			if(text.contentEquals("Action")) {
				listItems.get(i).click();
				break;
			}
		}
		
	}
	
	@Test
	public void test3() {
		driver.manage().window().maximize();
		delayFor(5000);
		//WebElement element = driver.findElement(By.xpath("//select[@class='selectpicker show-tick']"));
		//Select list = new Select(element);
		//list.selectByVisibleText("Ketchup");
		
		WebElement selectGroup = driver.findElements(By.cssSelector(" div.btn-group.bootstrap-select.show-tick")).get(0);
		
		//WebElement selectGroup = driver.findElement(By.xpath("(//div[@class='btn-group bootstrap-select show-tick'])[1]"));
		WebElement button = selectGroup.findElement(By.tagName("Button"));
		button.click();
		
		List<WebElement> listItems = selectGroup.findElements(By.xpath("//ul/li/a/span[1]"));
		System.out.println("List count: " + listItems.size());
		for(int i = 0; i < listItems.size(); i++) {
			String text = listItems.get(i).getText();
			System.out.println("Item: " + text);
			if(text.contentEquals("Ketchup")) {
				listItems.get(i).click();
				break;
			}
		}
		
	}
	
	@Test
	public void test4() {
		driver.manage().window().maximize();
		delayFor(5000);
		WebElement selectGroup = driver.findElements(By.cssSelector(" div.btn-group.bootstrap-select.show-tick")).get(1);
		bootstrapComboSelectByVisibleText(selectGroup,"Ketchup", true);
	}
	
	@Test
	public void test5() {
		driver.manage().window().maximize();
		delayFor(5000);
		WebElement selectGroup = driver.findElements(By.cssSelector(" div.btn-group.bootstrap-select.show-tick")).get(1);
		String[] itemToSelect = {"Ketchup","Relish"};
		//bootstrapComboSelectByVisibleTextEx(selectGroup,itemToSelect);
		bootstrapComboSelectByVisibleTextEx(selectGroup,"Ketchup","Relish");
	}
	@Test
	public void test6() {
		driver.manage().window().maximize();
		delayFor(5000);
		WebElement selectGroup = driver.findElements(By.cssSelector(" div.btn-group.bootstrap-select.show-tick")).get(0);
		bootstrapComboSelectByVisibleTextEx(selectGroup,"Ketchup");
	}
	
	@Test
	public void test7() {
		driver.manage().window().maximize();
		delayFor(5000);
		WebElement selectGroup = driver.findElements(By.cssSelector("div.btn-group.bootstrap-select")).get(2);
		bootstrapComboSelectByVisibleTextEx(selectGroup,"Ketchup Heinz".replaceAll(" ", ""));
	}
	
	public void bootstrapComboSelectByVisibleText(WebElement element, String textToSelect,boolean isMulty) {
		WebElement button = element.findElement(By.tagName("Button"));
		button.click();
				
		List<WebElement> listItems = element.findElements(By.xpath("//ul/li/a/span[1]"));
		System.out.println("List count: " + listItems.size());
		for(int i = 0; i < listItems.size(); i++) {
				String text = listItems.get(i).getText();
				System.out.println("Item: " + text);
				if(text.contentEquals(textToSelect)) {
					listItems.get(i).click();
					
					if(isMulty) {
						button.click();
					}
					
					break;
				}
		}			
	}
	
	public void bootstrapComboSelectByVisibleTextEx(WebElement element, String... textToSelect) {
		
		Set<String> textToSelectSet = new HashSet<String>(Arrays.asList(textToSelect));	
		
		WebElement button = element.findElement(By.tagName("Button"));
		button.click();
			
		List<WebElement> listItems = element.findElements(By.xpath("//ul/li/a/span[1]"));
		System.out.println("List count: " + listItems.size());
		
		
		for(int i = 0; i < listItems.size(); i++) {
			String text = listItems.get(i).getText();
			System.out.println("Item: " + text);
			if(textToSelectSet.contains(text)) {
				listItems.get(i).click();
			}	
		}
		if(element.getAttribute("class").contains("open")) {
			button.click();
		}
		
	
	}
	
}
