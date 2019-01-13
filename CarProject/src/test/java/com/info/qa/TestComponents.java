package com.info.qa;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestComponents extends FirstMaven{
	
	
	@Override
	@Before
	public void setUp() {
	super.setUp();
	driver.navigate().to("http://shifttest.shiftedtech.com/components/text_box");
	}
	@Test
	public void test() {
	    WebElement element= driver.findElement(By.id("username-text"));	
		element.click();
	delayFor(10000);
		element.sendKeys("manpreet@yahoo.com",Keys.TAB,"password",Keys.TAB,"12102018");
		delayFor(10000);
	    //WebElement element2= driver.findElement(By.id("password-text"));	
		//element2.click();
		//element2.sendKeys("Hello");
		//WebElement element3= driver.findElement(By.id("date"));
		//element3.click();
		//element3.sendKeys("12102018");
		
		WebElement element4=driver.findElement(By.id("datetime-local"));
        element4.sendKeys("11082018");
        WebElement element5= driver.findElement(By.id("number"));
        delayFor(5000);
        element5.sendKeys("4");
        delayFor(5000);
        element5.sendKeys(Keys.ARROW_DOWN);
        delayFor(5000);
        element5.sendKeys(Keys.ARROW_UP,Keys. ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP);
      
       // element5.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,);
        delayFor(5000);





	}
	
	
	
	
	

}
