package com.info.qa;

import javax.swing.text.Element;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Checkbox extends FirstMaven {
		@Override
		@Before
		public void setUp() {
	      super.setUp();
	      driver.navigate().to("http://shifttest.shiftedtech.com/components/check_box");
	      
	
		}	
		@Test
		public void testBox() {
			WebElement verifycheckbox= driver.findElement(By.xpath("//input[@id='html-chk-box-01']"));
			//String clicked=verifycheckbox.getAttribute("checked");
			
		System.out.println(verifycheckbox.getAttribute("checked"));
		verifycheckbox.click();
		System.out.println(verifycheckbox.getAttribute("checked"));
	
		}
		
		
		
		
		
		
}
